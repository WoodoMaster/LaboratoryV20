package com.niptis.LaboratoryV20.test.jdbc;

public class RegExpTest {
    public static void main(String[] args) {
       /* int minSize = 4;
        int maxSize = 10;
        String validationString = "qweewwwwwt";
       // StringBuilder stringBuilder = new StringBuilder("\\w{1,10}");
        StringBuilder stringBuilder = new StringBuilder("\\w{,}");
        stringBuilder.insert(3,minSize).insert(5,maxSize);
        Pattern pattern = Pattern.compile(stringBuilder.toString());
        Matcher matcher =pattern.matcher(validationString);
        System.out.println(matcher.matches());
*/
        StringBuffer sqlSelect = new StringBuffer("SELECT*FROM laboratory.users where (users.login = \'\' and" +
                " users.password = \'\')");
        sqlSelect.insert(51, "Ks");
        sqlSelect.insert(77, "129");
        String workingString = "SELECT*FROM laboratory.users where (users.login = \'Ks\' and users.password = \'129\')";
        System.out.println(sqlSelect.toString().equals(workingString));
        System.out.println(workingString);
        System.out.println(sqlSelect);
    }
}
