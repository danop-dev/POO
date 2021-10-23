package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class MathExpression{

    public static boolean parenthe(String math_expression) {

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pair_parenth = new HashMap<>();

        pair_parenth.put(')', '(');
        for (char ch : math_expression.toCharArray()) {
            if (pair_parenth.containsKey(ch)) {
                if (stack.empty() || stack.pop() != pair_parenth.get(ch)) {
                    return false;
                }
            } else if (pair_parenth.containsValue(ch)) {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void print_expressions(String f_content) {
        if (f_content == null){
            System.out.println("Fisierul este gol");
        }

        String[] f_line_arr = f_content.split("\n");
        for (String math_expr : f_line_arr) {
            if (parenthe(math_expr)) {
                String str_result = math_expr.replaceAll("\\s+","");
                System.out.println(math_expr + " = " + StrParse.eval(str_result));
            }
        }
    }
}