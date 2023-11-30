package net.gamrath;

import org.approvaltests.Approvals;
import org.approvaltests.JsonJacksonApprovals;
import org.junit.jupiter.api.Test;

class ExampleTest {
    @Test
    void myApprovalTestWithJSON() {
        JsonJacksonApprovals.verifyAsJson(new Person("John", 43));
    }

    @Test
    void myApprovalTest() {
        Approvals.verify(new Person("Alice", 10));
    }

    record Person(String name, int age) {
    }
}