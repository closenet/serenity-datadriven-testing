# sky-mario-priming
this repo is to automate the priming for the dn and uan numbers using the data driven testing process


How to use this automation prcoess?

1- Clone the sky-mario-priming from Git
2- In the project tree, go to test > java > test > MarioTest file 
3- Open it
4- Then Click  to run the test
5- And you should get the selenium FireFox Driver firing the browser

Test Steps
Setp 1- The FireFox opens the Mario page 
Step 2- Then it starts adding the dn and uan number to their respective text boxes - fetching these numbers from TestData sheet 
Step 3- And select the braodband types based on the selection mentioned in the testData sheet
Step 4- And finally submits the choices to complet the priming


To add addtional number you can do by the following
1- locate the TestData.csv file which is under the resources folder src > test > resources
2- add or remove as required - (If you want to remove number ask Euros Rees before that)
3- alternatively, you can replace the csv file with your own file but follow the same header naming to avoid the test to break
4- then, run the process


To change the evironment
1- go the MarioPage under src > test > java > page > marioPage
2- change the value of the @DefaultUrl attribute to your desired mario environment
