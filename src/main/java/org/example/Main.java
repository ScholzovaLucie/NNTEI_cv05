package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] definiceAutomatu = {"3120","", "(Z)", "[Z]", "{Z}"};
        StackAutomat automat = new StackAutomat();
        automat.loadRules(definiceAutomatu);

        System.out.println(automat.verifyString("{([])}")); // This should print true or false based on the verification
    }
}