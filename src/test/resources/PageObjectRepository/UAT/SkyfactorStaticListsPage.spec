Page Title: Static List

#Object Definitions
===================================================================================================================
lnk_setUp								xpath								//div[contains(@class, 'topNavDiv')]//a[contains(text(),'${tab}')]
createNewListBtn						css									.secondary-button.nevermind.pull-right
Modalwin								xpath								//div[@class="modal-content"]
NameField								xpath								.//*[@id='listName']			
DescField								xpath								.//*[@id='listDes']
CreateListBtn							xpath								.//*[@id="create-list"]//input[@value="Create List"]
nameInList								xpath								.//*[@id="static-list"]//p[@class="name"]/a[text()="${name}"]
successMsg								xpath								//table[@class="message-modal-window-message-table"]//div|//div[@class="message-modal-window-message"]/label
RemoveList								xpath								.//*[@id='static-list']//p[@title="${name}"]//..//following-sibling::td[@class="icons"]/a[@class='remove']
DeleteButton							xpath								//div[@class="modal-content"]//button[text()="Delete List"]
===================================================================================================================