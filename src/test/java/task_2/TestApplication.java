package task_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApplication {
    @Test
    void checkArrayApp() {
        //Data that was used in task description
        int[][] array = {{5, 4, 4}, {4, 3, 4}, {3, 2, 4}, {2, 2, 2}, {3, 3, 4}, {1, 4, 4}, {4, 1, 1}};
        //solution class
        int solution = Solution.solution(array);
        Assertions.assertEquals(11, solution);
    }
}
