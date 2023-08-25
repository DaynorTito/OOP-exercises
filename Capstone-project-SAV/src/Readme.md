# SAV

## Description

The program orders elements either integers or characters, which are passed as arguments to run the program from the command line, if you want you can specify the algorithm with which you want to order the elements, it is also mandatory to specify what type of data be ordered and their vector together with other parameters that will be specified, the command to execute the program must be done from the out/production/sav folder, otherwise the program will not be executed, before compiling the entire project in that folder , and from the Intellij Idea IDE just compile . The algorithms implemented for classification are: BubbleSort, MergeSort and QuickSort. And the parameters that must be specified are:

a => String, which allows you to select one of the three implemented sorting algorithms. The algorithms implemented and accepted at the time of program execution are:

• "B" or "b" -> Bubble sort (default)
• "M" or "m" -> Merge sort
• "Q" or "q" -> Quick sort

o => String, which allows you to select the type of ordering:
"az" or "AZ" for ascending order
"za" or "ZA" for descending order.

in => String
"R" or "r" for representing random values
"M" or "m" for representing values provided by the user.
If the parameter is "in=R," then the following parameter should be considered:

r => number, 1 <= r <= 40
This will generate random values for the list to be sorted, and note that random character values are also generated.

## Example

For example if you want to sort a vector of integers you could do it in the following way:

**java SAV a=b t=n o=az in=r r=10 s=140**

**java SAV a=q t=c o=az in=r r=10 s=140**

**java SAV a=m t=c o=az in=m v="a,f,r,f,x" s=140**

This command will sort the elements with the default algorithm which in this case is "BubbleSort".

The expected inputs and outputs are as follows:

| Input Example                                  | Output Example                                                                                                                                                                  |
|------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| java SAV a=b t=n o=az in=r r=10 s=140          | Type: [Numeric]<br>Values: [-2,3,5,8,-5,2,1,30,5,20]<br>Sorting: [-5,-2,1,2,3,5,5,8,20,30]<br>Algorithm: BubbleSort<br>Total time: 1400 ms                                      |
| java SAV a=q t=c o=az in=r r=10 s=140          | Type: [Character]<br>Values: ['A','z','z','s','d','v','M','v','a','r']<br>Sorting: ['A','M','a','d','r','s','d','v','v','z','z']<br>Algorithm: QuickSort<br>Total time: 1400 ms |
| java SAV a=m t=c o=az in=m v="a,f,r,f,x" s=140 | Type: [Character]<br>Values: ['a','f','r','f','x']<br>Sorting: ['a','f','f','r','x']<br>Algorithm: Merge Sort<br>Total time: 1400 ms                                            |

