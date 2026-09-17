class Solution:
    def reverseWords(self, s: str) -> str:
        

        words = s.split()              #split the words to remove the extra space
        words.reverse() 
                        #  after split  reverse it  to solve 
        return " ".join(words)                 # return the. string along with the extra space in it




        #time complexity  is 0(n)
        #space complexity is 0(n)





        