class Solution(object):
    def fizzBuzz(self, n):
        l=[]
        for i in range(1,n+1):
            if i%3==0:
                if i%5==0:
                    l.append("FizzBuzz")
                else:
                    l.append("Fizz")
            elif i%5==0:
                l.append("Buzz")
            else:
                l.append(str(i))
        return l
        
        