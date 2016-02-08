a. A brief introduction

This program prints out the receipt of input shopping baskets in an OOP approach. In this program the items in the shopping cart will be instantiated, and computes the shopping details including price with tax, total tax and final prices to users. When being run, the program will read a text file (e.g. Test1.txt) and prints out a receipt text file (Receipt.txt).


b. Details on development environment

This program is developed in a MAC os with java version "1.8.0_60”.


c. Running Instruction

There are two ways of running this program: using terminal (or command line) and using eclipse. 

(1) To run the program using terminal, cd to the “bin” folder and type:

$ java Items.main Test3.txt

In which the input argument indicates the input file is Text3.txt located in the “bin” folder. By changing the input argument the user can test different inputs from the same folder. The output file will also locate in “bin” folder with the name of “Receipt.txt”. 

(2) To run the program using eclipse, change the path of the input file in source file “src/Items/main.java” to the desired input path. For example, line “File = "Test1.txt”;” indicates the input file is “Test1.txt” in the root folder of this program. The output file will locate at the same folder as the input file (root folder of the program) with the name of “Receipt.txt”. 


d. Sample result

With input “Test3.txt” as follow:

1 imported bottle of perfume at 27.99
1 bottle of perfume at 18.99
1 packet of headache pills at 9.75
1 imported box of chocolates at 11.25

The output will be:

1 imported bottle of perfume: 32.191 bottle of perfume: 20.891 packet of headache pills: 9.751 imported box of chocolates: 11.85Sales Taxes: 6.70Total: 74.68

Hope you like it!
Mengzhuo Lu (Anita)