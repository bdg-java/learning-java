package com.bdg.Pattern.Behavioral.Cain_Of_Responsibility;

public interface Chain {

     void setNext(Chain nextChain);
     void process(Number request);
}
