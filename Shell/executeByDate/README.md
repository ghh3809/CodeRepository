##Description
A template for executing shell code by date.

##Instruction
1. Substitute the code part `Your code here` with your code.
2. Use variable `executeDate` as current execute date.
3. `sh executeByDate (startDate) (finalDate) (stepDay)` for your code.
4. If there are no arguments for the command, the program will only execute date of yesterday.
5. If there is one argument for the command, the program will only execute date of the argument.
6. If `startDate` is greater than `finalDate`, the program will execute inversely in date. `stepDay` means the days step to execute. The default value of `stepDay` is 1 if you do not input for that argument. 

##Output
One example output is like this:

> \**********************
> 
> Execute date: 20170608
> 
> \**********************
> 
> ##########Your output##########
> 
> \****************************************
> 
> Date 20170608 has already been executed.
> 
> \****************************************
> 
> ...
