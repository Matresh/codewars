package main;

public class TenMinWalk {
    /*
    * You live in the city of Cartesia where all roads are laid
    *  out in a perfect grid. You arrived ten minutes too early
    * to an appointment, so you decided to take the opportunity
    * to go for a short walk. The city provides its citizens with
    * a Walk Generating App on their phones -- everytime you press
    * the button it sends you an array of one-letter strings representing
    * directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only
    * a single block for each letter (direction) and you know it takes you
    *  one minute to traverse one city block, so create a function that will
    * return true if the walk the app gives you will take you exactly ten minutes
    * (you don't want to be early or late!) and will, of course, return you to your
    * starting point. Return false otherwise.

Note: you will always receive a valid array containing a random assortment of
*  direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty
* array (that's not a walk, that's standing still!).
    * */

    public static class Walker{
        Integer vertical;
        Integer horizontal;
        public Walker(){
            this.vertical = 0;
            this.horizontal = 0;

        }

        public void Move(Character directions){
            // CodeWars uses JDK 11 (((((((((
            switch (directions){
                case 'w': this.vertical++;break;
                case 'e': this.vertical--;break;
                case 'n': this.horizontal++;break;
                case 's': this.horizontal--;break;
            }
        };
        public Boolean isBasePosition(){
            return this.vertical == 0 && this.horizontal == 0;
        }
    }
    public static boolean isValid(char[] walk) {
        String walk_string = new String(walk);
        if (walk_string.length() != 10){
            return false;
        }
        Walker walker = new Walker();
        walk_string.
                chars().
                mapToObj(x -> (char) x).
                forEach(walker::Move);
        return walker.isBasePosition();
    }
}