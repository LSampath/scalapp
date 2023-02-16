package basics;

import java.util.List;

public class SimpleJavaForLoop {
    public SimpleJavaForLoop() {

        var numberList = List.of(1,4,6,3,7,11,57,34);
        var oddNumberList = List.of();
        for (int i=0; i<numberList.size(); i++) {
            var numb = numberList.get(i);
            if (numb%2 != 0) {
                oddNumberList.add(numb);
            }
        }

    }
}
