import java.util.ArrayList;
import java.util.List;

class Main{
public static void main(String[] args){

	List<String> playernames = new ArrayList<>();
	playernames.add("Anders");
	playernames.add("David");
	playernames.add("Noah");

	Team hellokittens = new Team("hellokittens", 1, playernames);

    System.out.println(hellokittens.getName() + " has a ranking of " + hellokittens.getRanking());

    hellokittens.setRanking(4);

        System.out.println(hellokittens.getName() + " has a ranking of " + hellokittens.getRanking());


  }
}

