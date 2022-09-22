package me.java;

public class NestedLoopPractice {
    public static void main(String[] args) {
        String goal = "hello";
        String target = "llo";

        //"llo" in "hello" 확인하는 함수
    }
    public static boolean isIncluded(String goal, String target){
        if(target.length()==0||goal.length()==0)return false;
        if(target.length()>goal.length()) return false;
        for(int i =0; i<goal.length(); i++){
            String tmp = "";
            for(int j =0; j<target.length();j++){

            }
        }
        return goal.contains(target);

    }
}
