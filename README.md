# Secondary Structure of RNA
This Java application was developed for my advanced algorithms class in order to explore dynamic programming techniques. The application receives a string of characters from the RNA alphabet of nucleic acid bases {'a','c','g','u'}, and then determines the greatest number of complimentary base pairs in the sequence. As of right now, the application does not work.

## Background
Although RNA is a single stranded structure, RNA also folds upon itself in secondary and teriary structures. This folding is accomplished by the pairing of complimentary base pairs in the RNA alphabet {{a,u},{g,c}}. As the number bases in the RNA sequence grows, the possible combinations of base pairs increase exponentially. Luckily there are some rules that invalidate some sequences. 
+ Bases can only pair with 1 other base
+ Only {{a,u},{g,c}} pairs are allowed
+ Base pairs must be seperated by at least 4 intermeditate bases
+ Pairs cannot cross (i.e. if {1,7} is a pair {2,8} is a cross and therefore invalid)
This application uses a dynamic programming approach aquire the largest number of pairs. It does not weight either {g,c} or {a,u} pairs over each other.
The recursive function is as follows:
![alt text](https://github.com/Andrew-Wichmann/Secondary-Structure-of-RNA/blob/master/pics/OPT-function.jpg "OPT function")

### Built with
+ Java

### Authors
+ Andrew Wichmann AndrewWichmann@siu.edu

### License
This application is licensed under the MIT license.
