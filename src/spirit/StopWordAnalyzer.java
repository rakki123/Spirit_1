
package spirit;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * This class serves the purpose of stop word removal from the attributes.
 * @author Sabarish Raghu
 *
 */
public class StopWordAnalyzer {
Set<String> stopWordList;
/**
 * Initialize all the stopwords. Stopwords are the common words in 
 * English which does not have much significance in clustering
 * 
 */
public StopWordAnalyzer()
{
		stopWordList=new HashSet<String>();
		stopWordList.add("a");
		stopWordList.add("able");
		stopWordList.add("about");
		stopWordList.add("above");
		stopWordList.add("according");
		stopWordList.add("accordingly");
		stopWordList.add("across");
		stopWordList.add("actually");
		stopWordList.add("after");
		stopWordList.add("afterwards");
		stopWordList.add("again");
		stopWordList.add("against");
		stopWordList.add("ain't");
		stopWordList.add("all");
		stopWordList.add("allow");
		stopWordList.add("allows");
		stopWordList.add("almost");
		stopWordList.add("alone");
		stopWordList.add("along");
		stopWordList.add("already");
		stopWordList.add("also");
		stopWordList.add("although");
		stopWordList.add("always");
		stopWordList.add("am");
		stopWordList.add("among");
		stopWordList.add("amongst");
		stopWordList.add("an");
		stopWordList.add("and");
		stopWordList.add("another");
		stopWordList.add("any");
		stopWordList.add("anybody");
		stopWordList.add("anyhow");
		stopWordList.add("anyone");
		stopWordList.add("anything");
		stopWordList.add("anyway");
		stopWordList.add("anyways");
		stopWordList.add("anywhere");
		stopWordList.add("apart");
		stopWordList.add("appear");
		stopWordList.add("appreciate");
		stopWordList.add("appropriate");
		stopWordList.add("are");
		stopWordList.add("aren't");
		stopWordList.add("around");
		stopWordList.add("as");
		stopWordList.add("aside");
		stopWordList.add("ask");
		stopWordList.add("asking");
		stopWordList.add("associated");
		stopWordList.add("at");
		stopWordList.add("available");
		stopWordList.add("away");
		stopWordList.add("awfully");
		stopWordList.add("be");
		stopWordList.add("became");
		stopWordList.add("because");
		stopWordList.add("become");
		stopWordList.add("becomes");
		stopWordList.add("becoming");
		stopWordList.add("been");
		stopWordList.add("before");
		stopWordList.add("beforehand");
		stopWordList.add("behind");
		stopWordList.add("being");
		stopWordList.add("believe");
		stopWordList.add("below");
		stopWordList.add("beside");
		stopWordList.add("besides");
		stopWordList.add("best");
		stopWordList.add("better");
		stopWordList.add("between");
		stopWordList.add("beyond");
		stopWordList.add("both");
		stopWordList.add("brief");
		stopWordList.add("but");
		stopWordList.add("by");
		stopWordList.add("c'mon");
		stopWordList.add("c's");
		stopWordList.add("came");
		stopWordList.add("can");
		stopWordList.add("can't");
		stopWordList.add("cannot");
		stopWordList.add("cant");
		stopWordList.add("cause");
		stopWordList.add("causes");
		stopWordList.add("certain");
		stopWordList.add("certainly");
		stopWordList.add("changes");
		stopWordList.add("clearly");
		stopWordList.add("co");
		stopWordList.add("com");
		stopWordList.add("come");
		stopWordList.add("comes");
		stopWordList.add("concerning");
		stopWordList.add("consequently");
		stopWordList.add("consider");
		stopWordList.add("considering");
		stopWordList.add("contain");
		stopWordList.add("containing");
		stopWordList.add("contains");
		stopWordList.add("corresponding");
		stopWordList.add("could");
		stopWordList.add("couldn't");
		stopWordList.add("course");
		stopWordList.add("currently");
		stopWordList.add("definitely");
		stopWordList.add("described");
		stopWordList.add("despite");
		stopWordList.add("did");
		stopWordList.add("didn't");
		stopWordList.add("different");
		stopWordList.add("do");
		stopWordList.add("does");
		stopWordList.add("doesn't");
		stopWordList.add("doing");
		stopWordList.add("don't");
		stopWordList.add("done");
		stopWordList.add("down");
		stopWordList.add("downwards");
		stopWordList.add("during");
		stopWordList.add("each");
		stopWordList.add("edu");
		stopWordList.add("eg");
		stopWordList.add("eight");
		stopWordList.add("either");
		stopWordList.add("else");
		stopWordList.add("elsewhere");
		stopWordList.add("enough");
		stopWordList.add("entirely");
		stopWordList.add("especially");
		stopWordList.add("et");
		stopWordList.add("etc");
		stopWordList.add("even");
		stopWordList.add("ever");
		stopWordList.add("every");
		stopWordList.add("everybody");
		stopWordList.add("everyone");
		stopWordList.add("everything");
		stopWordList.add("everywhere");
		stopWordList.add("ex");
		stopWordList.add("exactly");
		stopWordList.add("example");
		stopWordList.add("except");
		stopWordList.add("far");
		stopWordList.add("few");
		stopWordList.add("fifth");
		stopWordList.add("first");
		stopWordList.add("five");
		stopWordList.add("followed");
		stopWordList.add("following");
		stopWordList.add("follows");
		stopWordList.add("for");
		stopWordList.add("former");
		stopWordList.add("formerly");
		stopWordList.add("forth");
		stopWordList.add("four");
		stopWordList.add("from");
		stopWordList.add("further");
		stopWordList.add("furthermore");
		stopWordList.add("get");
		stopWordList.add("gets");
		stopWordList.add("getting");
		stopWordList.add("given");
		stopWordList.add("gives");
		stopWordList.add("go");
		stopWordList.add("goes");
		stopWordList.add("going");
		stopWordList.add("gone");
		stopWordList.add("got");
		stopWordList.add("gotten");
		stopWordList.add("greetings");
		stopWordList.add("had");
		stopWordList.add("hadn't");
		stopWordList.add("happens");
		stopWordList.add("hardly");
		stopWordList.add("has");
		stopWordList.add("hasn't");
		stopWordList.add("have");
		stopWordList.add("haven't");
		stopWordList.add("having");
		stopWordList.add("he");
		stopWordList.add("he's");
		stopWordList.add("hello");
		stopWordList.add("help");
		stopWordList.add("hence");
		stopWordList.add("her");
		stopWordList.add("here");
		stopWordList.add("here's");
		stopWordList.add("hereafter");
		stopWordList.add("hereby");
		stopWordList.add("herein");
		stopWordList.add("hereupon");
		stopWordList.add("hers");
		stopWordList.add("herself");
		stopWordList.add("hi");
		stopWordList.add("him");
		stopWordList.add("himself");
		stopWordList.add("his");
		stopWordList.add("hither");
		stopWordList.add("hopefully");
		stopWordList.add("how");
		stopWordList.add("howbeit");
		stopWordList.add("however");
		stopWordList.add("i'd");
		stopWordList.add("i'll");
		stopWordList.add("i'm");
		stopWordList.add("i've");
		stopWordList.add("ie");
		stopWordList.add("if");
		stopWordList.add("ignored");
		stopWordList.add("immediate");
		stopWordList.add("in");
		stopWordList.add("inasmuch");
		stopWordList.add("inc");
		stopWordList.add("indeed");
		stopWordList.add("indicate");
		stopWordList.add("indicated");
		stopWordList.add("indicates");
		stopWordList.add("inner");
		stopWordList.add("insofar");
		stopWordList.add("instead");
		stopWordList.add("into");
		stopWordList.add("inward");
		stopWordList.add("is");
		stopWordList.add("isn't");
		stopWordList.add("it");
		stopWordList.add("it'd");
		stopWordList.add("it'll");
		stopWordList.add("it's");
		stopWordList.add("its");
		stopWordList.add("itself");
		stopWordList.add("just");
		stopWordList.add("keep");
		stopWordList.add("keeps");
		stopWordList.add("kept");
		stopWordList.add("know");
		stopWordList.add("known");
		stopWordList.add("knows");
		stopWordList.add("last");
		stopWordList.add("lately");
		stopWordList.add("later");
		stopWordList.add("latter");
		stopWordList.add("latterly");
		stopWordList.add("least");
		stopWordList.add("less");
		stopWordList.add("lest");
		stopWordList.add("let");
		stopWordList.add("let's");
		stopWordList.add("like");
		stopWordList.add("liked");
		stopWordList.add("likely");
		stopWordList.add("little");
		stopWordList.add("look");
		stopWordList.add("looking");
		stopWordList.add("looks");
		stopWordList.add("ltd");
		stopWordList.add("mainly");
		stopWordList.add("many");
		stopWordList.add("may");
		stopWordList.add("maybe");
		stopWordList.add("me");
		stopWordList.add("mean");
		stopWordList.add("meanwhile");
		stopWordList.add("merely");
		stopWordList.add("might");
		stopWordList.add("more");
		stopWordList.add("moreover");
		stopWordList.add("most");
		stopWordList.add("mostly");
		stopWordList.add("much");
		stopWordList.add("must");
		stopWordList.add("my");
		stopWordList.add("myself");
		stopWordList.add("name");
		stopWordList.add("namely");
		stopWordList.add("nd");
		stopWordList.add("near");
		stopWordList.add("nearly");
		stopWordList.add("necessary");
		stopWordList.add("need");
		stopWordList.add("needs");
		stopWordList.add("neither");
		stopWordList.add("never");
		stopWordList.add("nevertheless");
		stopWordList.add("new");
		stopWordList.add("next");
		stopWordList.add("nine");
		stopWordList.add("no");
		stopWordList.add("nobody");
		stopWordList.add("non");
		stopWordList.add("none");
		stopWordList.add("noone");
		stopWordList.add("nor");
		stopWordList.add("normally");
		stopWordList.add("not");
		stopWordList.add("nothing");
		stopWordList.add("novel");
		stopWordList.add("now");
		stopWordList.add("nowhere");
		stopWordList.add("obviously");
		stopWordList.add("of");
		stopWordList.add("off");
		stopWordList.add("often");
		stopWordList.add("oh");
		stopWordList.add("ok");
		stopWordList.add("okay");
		stopWordList.add("old");
		stopWordList.add("on");
		stopWordList.add("once");
		stopWordList.add("one");
		stopWordList.add("ones");
		stopWordList.add("only");
		stopWordList.add("onto");
		stopWordList.add("or");
		stopWordList.add("other");
		stopWordList.add("others");
		stopWordList.add("otherwise");
		stopWordList.add("ought");
		stopWordList.add("our");
		stopWordList.add("ours");
		stopWordList.add("ourselves");
		stopWordList.add("out");
		stopWordList.add("outside");
		stopWordList.add("over");
		stopWordList.add("overall");
		stopWordList.add("own");
		stopWordList.add("particular");
		stopWordList.add("particularly");
		stopWordList.add("per");
		stopWordList.add("perhaps");
		stopWordList.add("placed");
		stopWordList.add("please");
		stopWordList.add("plus");
		stopWordList.add("possible");
		stopWordList.add("presumably");
		stopWordList.add("probably");
		stopWordList.add("provides");
		stopWordList.add("que");
		stopWordList.add("quite");
		stopWordList.add("qv");
		stopWordList.add("rather");
		stopWordList.add("rd");
		stopWordList.add("re");
		stopWordList.add("really");
		stopWordList.add("reasonably");
		stopWordList.add("regarding");
		stopWordList.add("regardless");
		stopWordList.add("regards");
		stopWordList.add("relatively");
		stopWordList.add("respectively");
		stopWordList.add("right");
		stopWordList.add("said");
		stopWordList.add("same");
		stopWordList.add("saw");
		stopWordList.add("say");
		stopWordList.add("saying");
		stopWordList.add("says");
		stopWordList.add("second");
		stopWordList.add("secondly");
		stopWordList.add("see");
		stopWordList.add("seeing");
		stopWordList.add("seem");
		stopWordList.add("seemed");
		stopWordList.add("seeming");
		stopWordList.add("seems");
		stopWordList.add("seen");
		stopWordList.add("self");
		stopWordList.add("selves");
		stopWordList.add("sensible");
		stopWordList.add("sent");
		stopWordList.add("serious");
		stopWordList.add("seriously");
		stopWordList.add("seven");
		stopWordList.add("several");
		stopWordList.add("shall");
		stopWordList.add("she");
		stopWordList.add("should");
		stopWordList.add("shouldn't");
		stopWordList.add("since");
		stopWordList.add("six");
		stopWordList.add("so");
		stopWordList.add("some");
		stopWordList.add("somebody");
		stopWordList.add("somehow");
		stopWordList.add("someone");
		stopWordList.add("something");
		stopWordList.add("sometime");
		stopWordList.add("sometimes");
		stopWordList.add("somewhat");
		stopWordList.add("somewhere");
		stopWordList.add("soon");
		stopWordList.add("sorry");
		stopWordList.add("specified");
		stopWordList.add("specify");
		stopWordList.add("specifying");
		stopWordList.add("still");
		stopWordList.add("sub");
		stopWordList.add("such");
		stopWordList.add("sup");
		stopWordList.add("sure");
		stopWordList.add("t's");
		stopWordList.add("take");
		stopWordList.add("taken");
		stopWordList.add("tell");
		stopWordList.add("tends");
		stopWordList.add("th");
		stopWordList.add("than");
		stopWordList.add("thank");
		stopWordList.add("thanks");
		stopWordList.add("thanx");
		stopWordList.add("that");
		stopWordList.add("that's");
		stopWordList.add("thats");
		stopWordList.add("the");
		stopWordList.add("their");
		stopWordList.add("theirs");
		stopWordList.add("them");
		stopWordList.add("themselves");
		stopWordList.add("then");
		stopWordList.add("thence");
		stopWordList.add("there");
		stopWordList.add("there's");
		stopWordList.add("thereafter");
		stopWordList.add("thereby");
		stopWordList.add("therefore");
		stopWordList.add("therein");
		stopWordList.add("theres");
		stopWordList.add("thereupon");
		stopWordList.add("these");
		stopWordList.add("they");
		stopWordList.add("they'd");
		stopWordList.add("they'll");
		stopWordList.add("they're");
		stopWordList.add("they've");
		stopWordList.add("think");
		stopWordList.add("third");
		stopWordList.add("this");
		stopWordList.add("thorough");
		stopWordList.add("thoroughly");
		stopWordList.add("those");
		stopWordList.add("though");
		stopWordList.add("three");
		stopWordList.add("through");
		stopWordList.add("throughout");
		stopWordList.add("thru");
		stopWordList.add("thus");
		stopWordList.add("to");
		stopWordList.add("together");
		stopWordList.add("too");
		stopWordList.add("took");
		stopWordList.add("toward");
		stopWordList.add("towards");
		stopWordList.add("tried");
		stopWordList.add("tries");
		stopWordList.add("truly");
		stopWordList.add("try");
		stopWordList.add("trying");
		stopWordList.add("twice");
		stopWordList.add("two");
		stopWordList.add("un");
		stopWordList.add("under");
		stopWordList.add("unfortunately");
		stopWordList.add("unless");
		stopWordList.add("unlikely");
		stopWordList.add("until");
		stopWordList.add("unto");
		stopWordList.add("up");
		stopWordList.add("upon");
		stopWordList.add("us");
		stopWordList.add("use");
		stopWordList.add("used");
		stopWordList.add("useful");
		stopWordList.add("uses");
		stopWordList.add("using");
		stopWordList.add("usually");
		stopWordList.add("value");
		stopWordList.add("various");
		stopWordList.add("very");
		stopWordList.add("via");
		stopWordList.add("viz");
		stopWordList.add("vs");
		stopWordList.add("want");
		stopWordList.add("wants");
		stopWordList.add("was");
		stopWordList.add("wasn't");
		stopWordList.add("way");
		stopWordList.add("we");
		stopWordList.add("we'd");
		stopWordList.add("we'll");
		stopWordList.add("we're");
		stopWordList.add("we've");
		stopWordList.add("welcome");
		stopWordList.add("well");
		stopWordList.add("went");
		stopWordList.add("were");
		stopWordList.add("weren't");
		stopWordList.add("what");
		stopWordList.add("what's");
		stopWordList.add("whatever");
		stopWordList.add("when");
		stopWordList.add("whence");
		stopWordList.add("whenever");
		stopWordList.add("where");
		stopWordList.add("where's");
		stopWordList.add("whereafter");
		stopWordList.add("whereas");
		stopWordList.add("whereby");
		stopWordList.add("wherein");
		stopWordList.add("whereupon");
		stopWordList.add("wherever");
		stopWordList.add("whether");
		stopWordList.add("which");
		stopWordList.add("while");
		stopWordList.add("whither");
		stopWordList.add("who");
		stopWordList.add("who's");
		stopWordList.add("whoever");
		stopWordList.add("whole");
		stopWordList.add("whom");
		stopWordList.add("whose");
		stopWordList.add("why");
		stopWordList.add("will");
		stopWordList.add("willing");
		stopWordList.add("wish");
		stopWordList.add("with");
		stopWordList.add("within");
		stopWordList.add("without");
		stopWordList.add("won't");
		stopWordList.add("wonder");
		stopWordList.add("would");
		stopWordList.add("wouldn't");
		stopWordList.add("yes");
		stopWordList.add("yet");
		stopWordList.add("you");
		stopWordList.add("you'd");
		stopWordList.add("you'll");
		stopWordList.add("you're");
		stopWordList.add("you've");
		stopWordList.add("your");
		stopWordList.add("yours");
		stopWordList.add("yourself");
		stopWordList.add("yourselves");
		stopWordList.add("zero");
 
	
}
/**
 * Initialize the user defined stopWordList
 */
public StopWordAnalyzer(ArrayList<String> stopWordList)
{
	this.stopWordList.addAll(stopWordList);
}
/**
 * Removes all the stopWords in the record.
 * @param attribute
 * @return attribute/record with stopwords removed.  
 */

public String removeStopWords(String attribute)
{           
    List<String> listOfStrings = new LinkedList<String>(Arrays.asList(attribute.split(" ")));
    listOfStrings.removeAll(stopWordList);
    
   // attribute = String.join(" ", listOfStrings);    
    return attribute;
}
}
