[![Build Status](https://travis-ci.org/xDD-CLE/Emergent.svg?branch=master)](https://travis-ci.org/xDD-CLE/Emergent)
# Emergent
An RSpec inspired testing framework for Java with the goal of helping better designs emerge through expressive tests

## Motivation
I find great value in tests that are communicative. I never realized this value until working with RSpec.  
If you haven't yet tried [RSpec](http://rspec.info/), I suggest you do. I also suggest reading the [RSpec book](https://pragprog.com/book/achbd/the-rspec-book). It might just change the way you write code.  

For me, BDD has provided a greater level of visibility into the design of what I'm building. I look to my tests to tell me things about my design. If a test is difficult to setup, something might be wrong with my design. If the methods of the component I'm testing don't seem cohesive, there might be something wrong with my design. There are several little heuristics like this that guide me as I'm developing and I've found that they ultimately lead me to better designs had I not payed close attention to them.  

That being said, I've looked for a communicative tool like this in Java and haven't found one I've liked. In Scala, I'm fond of [Scala Test](http://www.scalatest.org/) but there are times (and teams) where adding another language into the mix can cause a bit of complexity that some aren't comfortable with. I do (at times) enjoy working with [Cucumber (and Cucumber JVM)](https://cucumber.io/) but find that this tool is best suited when collaborating with others at a less technical level than I usually find myself working in while in a tool like RSpec.

## So... The Goal
The goal of emerge is to provide a tool that allows TDD/BDD practitioners to better express the intent of what they're developing in Java.

I welcome any and all feedback and welcome all contributions to emerge so long as those who use emerge agree that these contributions align with this goal. 

## Downloading
(Gradle & Maven instructions to come)

## Using Emergent
(this is emerging (pun intented) - more to come)
```java
import com.xdd.Spec;
import static org.junit.Assert.*;

public class CalculatorSpec extends Spec {{

        it("calculates the sum of positive numbers", () -> {
            Calculator calculator = new Calculator();
            int result = calculator.add(2, 2);
            assertEquals(4, result);
        });

} }
```



