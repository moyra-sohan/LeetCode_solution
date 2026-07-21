class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }

        // Zellers Rules Approch

        int h = (day + (13 * (month + 1)) / 5 + year + (year / 4) - (year / 100) + (year / 400)) % 7;

        return days[h];
    }
}