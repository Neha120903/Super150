package ThreeHundred;

import java.util.Stack;

public class StackGetMinElement {
    Stack<Integer> s;
    int minElement = Integer.MAX_VALUE;

    // first we assume that we have only positive values so
    //here we are going to store the previous current min value- minimum value  this will give us an negative value which indicates that we
    // have a different value and we can get that by min value - s.pop() value

    int getMin()
    {
       return minElement;
    }

    int popElement(){
       int t=s.pop();
       if(t<=0)
       {
           int res=minElement;
           minElement = minElement -t;
           return res;
       }
       return t;
    }

    void push(int x)
    {
        if(s.isEmpty())
        {
            s.push(x);
            minElement=x;
        }
        else if(x < minElement)   // if the current value is less than the minimum value then we store the current-minvalue
        {
            minElement = x;
            s.push(x-minElement);
        }
        else
            s.push(x);
    }

    // for all positive and negative values we use 2* current min- previous element

    int getMin2()
    {
        return minElement;
    }

    int popElement2(){
        int t=s.pop();
        if(t<=0)
        {
            int res=minElement;
            minElement = 2*minElement -t;
            return res;
        }
        return t;
    }

    void push2(int x)
    {
        if(s.isEmpty())
        {
            s.push(x);
            minElement=x;
        }
        else if(x < minElement)   // if the current value is less than the minimum value then we store the current-minvalue
        {
            minElement = x;
            s.push(2*x-minElement);
        }
        else
            s.push(x);
    }



}