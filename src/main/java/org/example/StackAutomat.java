package org.example;
import java.util.HashMap;
import java.util.Map;

public class StackAutomat {
    private Map<Integer, String> rules = new HashMap<>();
    private String ruleSequence;

    public void setRule(int ruleNumber, String output) {
        rules.put(ruleNumber, output);
    }

    public void setRuleSequence(String sequence) {
        this.ruleSequence = sequence;
    }

    public boolean verifyString(String target) {
        CustomStack<String> stack = new CustomStack<>();

        String non_terminal = "Z";

        for (char ruleIndex : ruleSequence.toCharArray()) {
            String ruleOutput = rules.get(Character.getNumericValue(ruleIndex));
            if (ruleOutput == null) return false;

            stack.push(ruleOutput);
        }

        StringBuilder stringBuilder = new StringBuilder(stack.pop());
        while (!stack.empty()) {
            StringBuilder novy = new StringBuilder(stack.pop());
            int first_index = novy.indexOf(non_terminal);
            int last_index = first_index + non_terminal.length();
            novy.replace(first_index, last_index, stringBuilder.toString());
            stringBuilder = novy;
        }

        return stringBuilder.toString().equals(target);
    }
}
