package org.achainarong.exercisethree.exercises;

public class EBNF {

    // this method should analyze if the input value is in the form of the following
    // form
    // Expr = SExpr | [Op1] "(" SExpr ")".
    // SExpr = Digit Op Digit.
    // Op = Op1 | Op2.
    // Op1 = "+" | "-".
    // Op2 = "*" | "/".
    // Digit = "0"|"1"|"2"|"3"|"4"|"5"|"6"|"7"|"8"|"9".
    public static int AnalyzeFormAndReturnCalculation() {

        String scannedLine = System.console().readLine("Enter your expression to evaluate: ").replaceAll("\s+", "");
        char[] expressionCharArray = scannedLine.toCharArray();

        if (scannedLine.contains("(") && scannedLine.contains(")")) {
            return AnalyzeAndCalculateExpressionWithBrackets(expressionCharArray);
        } else if (scannedLine.contains("(") || scannedLine.contains(")")) {
            throw new IllegalArgumentException("Opening or closing bracket is missing!");
        } else {
            return AnaylzeAndCalculateExpressionWithoutBracktes(expressionCharArray);
        }
    }

    private static int AnaylzeAndCalculateExpressionWithoutBracktes(char[] expressionCharArray) {
        if (expressionCharArray.length >= 3) {
            // checks if there is math sign at the beginning of the expression
            // if there is one the sign gets added after the calculation
            if (checkIfCharIsValid(expressionCharArray[0], "+-")) {
                int calculatedResult = CalculateResult(expressionCharArray[1], expressionCharArray[3],
                        expressionCharArray[2]);

                return expressionCharArray[0] == '+' ? calculatedResult : -calculatedResult;
            }

            return CalculateResult(expressionCharArray[0], expressionCharArray[2], expressionCharArray[1]);
        } else {
            throw new IllegalArgumentException("The given expression must have a length of at least 3!");
        }
    }

    // If there are brackets other position of the char array need to given to
    // calculate the result
    private static int AnalyzeAndCalculateExpressionWithBrackets(char[] expressionCharArray) {
        if (expressionCharArray[expressionCharArray.length - 1] != ')') {
            throw new IllegalArgumentException("The Symbol \")\" has to be at the end of the expression!");
        }

        else if (expressionCharArray[0] == '(' && expressionCharArray[expressionCharArray.length - 1] == ')') {
            return CalculateResult(expressionCharArray[1], expressionCharArray[3], expressionCharArray[2]);
        }

        else if (checkIfCharIsValid(expressionCharArray[0], "+-") && expressionCharArray[1] == '('
                && expressionCharArray[expressionCharArray.length - 1] == ')') {
            int calculatedResult = CalculateResult(expressionCharArray[2], expressionCharArray[4],
                    expressionCharArray[3]);

            return expressionCharArray[0] == '+' ? calculatedResult : -calculatedResult;
        }

        else {
            throw new IllegalArgumentException("Only \"+-(\" are allowed at first position!");
        }
    }

    // checks if the operants are digits and depending on the operator calculates
    // the result
    private static int CalculateResult(char firstOperand, char secondOperand, char operator) {
        String allowedDigits = "0123456789";

        if (checkIfCharIsValid(firstOperand, allowedDigits) && checkIfCharIsValid(secondOperand, allowedDigits)) {
            int valueOfFirstOperand = Character.getNumericValue(firstOperand);
            int valueOfSecondOperand = Character.getNumericValue(secondOperand);

            switch (operator) {
                case '+':
                    return valueOfFirstOperand + valueOfSecondOperand;
                case '-':
                    return valueOfFirstOperand - valueOfSecondOperand;
                case '*':
                    return valueOfFirstOperand * valueOfSecondOperand;
                case '/':
                    return valueOfFirstOperand / valueOfSecondOperand;
                default:
                    throw new IllegalArgumentException("Allowed Operators are \"+-/*\"!");

            }
        } else {
            throw new IllegalArgumentException("Only digits are allowed for operands");
        }
    }

    private static boolean checkIfCharIsValid(char charToValidate, String AllowedCharactersAsString) {
        return AllowedCharactersAsString.contains(String.valueOf(charToValidate));
    }
}