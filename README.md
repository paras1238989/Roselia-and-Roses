# Roselia-and-Roses

************* Partially solved - Passed for only few test cases*********************** Do let me know if complete solution found*******

# Roselia and Roses
Roselia loves roses. But roses are only available in the nth city. There are roads from each city to cities and these roads can only be utilized to move from city i to j city but not from city j  to city i for all 1≤i<j≤n . Roselia wants to maximize her happiness on the way she moves to the city n . Each city has a specific value of happiness quotient associated with it. Roselia is moody and her happiness is governed by a very specific rule:
•	Her happiness will increase by the happiness quotient of the city if that city is 1st, 3rd, 5th...(in general odd) in Roselia's journey else her happiness will decrease by the happiness quotient of the city
Roselia can start her journey from any city but must end her journey at nth  city. It is also possible that she starts her journey at nth  city itself. Your task is to output the maximum happiness she can obtain during her journey.
# Input
The first line contains denoting the number of test cases. 
For each test case, the first line contains denoting number of cities. Roses are available at nth  city. Next line contains space-separated integers where ith integer denotes the happiness quotient of city i .
# Output
For each test case output, a single integer denoting the maximum happiness Roselia can achieve in a new line.
# Constraints
1≤T≤105
1≤n≤105
The absolute value of happiness quotient of each city does not exceed 105
It is guaranteed that the sum of n over all the test cases does not exceed 106
