# Stopwatch tasks by Kwankaew Uttama (5910545647) (*)
I ran the tasks on a HP , and got these results:

Task | Time
--------------------------------------|-------:
Append 50,000 chars to String | 1.993447 sec
Append 100,000 chars to String | 4.572635 sec
Append 100,000 chars to StringBuilder | 0.005562 sec
Add 1 billion double using array | 3.149600 sec
Add 1 billion Double using array | 10.271118 sec
Add 1 billion BigDecimal using array | 17.249362 sec

Exaplanation of Results

Why does appending 100,000 chars to a String take more than 2X the time to append 50,000
chars?
-Because when every time addended the char to string, the new string was created, the variable will just point at new string and the old string isn't delete so it takes more time.

Why is appending to StringBuilder so much different than appending to String? What is
happening to the String?
-Becase when append char to string it will create the new string and take time to allocate the memory.But in StringBuilder the the first, it will create array that longer than the value that in the variable.When appended char to StringBuilder, it just add char to array not have to allocate the memory like appended to String.So it will spend less time.

Explain difference in time to sum double, Double, and BigDecimal. Which is faster and
why?
-Time to sum double is faestest because double is primitive,it isn't have attibutes and methods like Double and BigDecimal.Double is slower one but faster than BigDecimal because BigDecimal have attibutes and methods more than Double,So the process in BigDecimal will spends long time more than Double.