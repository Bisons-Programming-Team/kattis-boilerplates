# Kattis Boilerplates
### Overview
Starter kits for solutions to be submitted to the Kattis platform for competitions. Code boilerplates available are in Python, Java, and C/C++ hybrid.

### Motivation
Unlike most programming challenge platforms, Kattis does not have a built-in compiler which will run your code against tests before submission. You can only submit solutions **blindly** and failed submissions could negatively impact your score. It is very important that you have a local environment to test and run your solution files before submitting it to Kattis.

## Building and Running in Linux
Ensure your programming language of choice is installed in your Linux system. University computers should have them pre-installed. Modify the content of input.txt with desired test cases (except for Java where you have to input test cases manually). Open the terminal on this directory and enter the following commands: 

#### Python
`python3 boilerplate.py < input.txt`


#### Java
`javac Boilerplate.java` 

`java Boilerplate` 

Enter test cases manually


#### C/C++ Hybrid
`make boilerplate` 

`./boilerplate < input.txt`


## Building and Running in Windows
I have only used the Linux computers in university so far and I am not familiar with what applications or accommodations are available in Windows for testing locally. If you are working on your PC, here are suggestions to test and run files locally:
- Obtain a VSCode extension or IDE for your programming language of choice
- You can still use Linux through Windows by installing the Windows Subsystem for Linux, using a remote Linux server (e.g. Doing an ssh to university computers), or using a Linux virtual machine  

## External Resources
For a more definitive guide on Kattis input and output format, I recommend reading through [this repository](https://github.com/mwermelinger/kattis-guide/blob/master/input.md)
