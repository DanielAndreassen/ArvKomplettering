public class Forum {
    //att
    Human Swed = new Swedish("Sven", 30);
    Human Esp = new Spanish("Pedro", 12);
    Human Eng = new English("Boris", 60);
    Human Kor = new Korean("Dayhun", 26);

    //cosnt
    public Forum() {
        makePeopleTalk();
    }

    //meth
    public void makePeopleTalk() {
        Swed.talk();
        Esp.talk();
        Eng.talk();
        Kor.talk();
    }

    //getsett
}
