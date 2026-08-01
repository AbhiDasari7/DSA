class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> a = new ArrayList<>();
        for(int i =0;i<n;i++)
        {
            if((i+1)%3==0&&(i+1)%5==0)
            a.add("FizzBuzz");
            else if((i+1)%3==0)
            a.add("Fizz");
            else if((i+1)%5==0)
            a.add("Buzz");
            else{
                String s = (i+1)+"";
            
            a.add(s);
            }
        }
        return a;
    }
}