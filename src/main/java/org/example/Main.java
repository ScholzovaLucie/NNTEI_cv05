package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StackAutomat automaton = new StackAutomat();
        automaton.setRule(0, "");
        automaton.setRule(1, "(Z)");
        automaton.setRule(2, "[Z]");
        automaton.setRule(3, "{Z}");

        automaton.setRuleSequence("3120");

        // Assuming your CustomStack works as expected, this should now handle the verification correctly
        System.out.println(automaton.verifyString("{([])}")); // This should print true or false based on the verification
    }
}