class statictest {
    String fname;
    String lname;
    int[] grade;
    int score;
    int passed;

    public statictest(String fname, String lname, int[] grade)
    {
        this.fname = fname;
        this.lname= lname;
        this.grade  = grade;
    }

    public void displayScore(){
        score = 10;
    }

    public int countPassed(int count){
        if (count < 50){
            passed = 100;
        }
        else {
            passed = 0;
        }
        return passed;
    }
    
}