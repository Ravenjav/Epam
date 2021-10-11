package test.action;

import by.epam.textReader.entity.Component;
import by.epam.textReader.entity.Composite;
import by.epam.textReader.service.compositeService.ParSeparation;
import by.epam.textReader.service.sort.SortParagraphs;
import by.epam.textReader.service.sort.SortText;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestCompos {
    @Test
    public void testTextTransformation(){
        String originalText = "It has survived - not only (five) centuries, but also the leap into 13<<2 electronic typesetting, " +
                "remaining 30>>>3 essentially ~6&9|(3&4) unchanged. It was popularised in the 5|(1&2&(3|(4&(25^5|6&47)|3)|2)|1) " +
                "with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum...\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking " +
                "at its layout. The point of using (~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78 Ipsum is that it has a more-or-less " +
                "normal distribution of letters, as opposed to using (Content here), content here', making it look like " +
                "readable English.\n\t It is a (8^5|1&2<<(2|5>>2&71))|1200 established fact that a reader will be of a page " +
                "when looking at its layout.\n";
        ParSeparation separation = new ParSeparation(originalText);
        Component finalText = separation.handleRequest();
        System.out.println(finalText.out(0));
    }

    @Test
    public void testParSort(){
        String originalText = "It has survived - not only (five) centuries, but also the leap into 13<<2 electronic typesetting, " +
                "remaining 30>>>3 essentially ~6&9|(3&4) unchanged. It was popularised in the 5|(1&2&(3|(4&(25^5|6&47)|3)|2)|1) " +
                "with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum...\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking " +
                "at its layout. The point of using (~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78 Ipsum is that it has a more-or-less " +
                "normal distribution of letters, as opposed to using (Content here), content here', making it look like " +
                "readable English.\n\t It is a (8^5|1&2<<(2|5>>2&71))|1200 established fact that a reader will be of a page " +
                "when looking at its layout.\n";
        ParSeparation separation = new ParSeparation(originalText);
        Component finalText = separation.handleRequest();
        finalText = new SortParagraphs().onSentNumb((Composite) finalText);
        System.out.println(finalText.out(0));
    }

    @Test
    public void TestWordSort(){
        String originalText = "It has survived - not only (five) centuries, but also the leap into 13<<2 electronic typesetting, " +
                "remaining 30>>>3 essentially ~6&9|(3&4) unchanged. It was popularised in the 5|(1&2&(3|(4&(25^5|6&47)|3)|2)|1) " +
                "with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum...\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking " +
                "at its layout. The point of using (~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78 Ipsum is that it has a more-or-less " +
                "normal distribution of letters, as opposed to using (Content here), content here', making it look like " +
                "readable English.\n\t It is a (8^5|1&2<<(2|5>>2&71))|1200 established fact that a reader will be of a page " +
                "when looking at its layout.\n";
        ParSeparation separation = new ParSeparation(originalText);
        Component finalText = separation.handleRequest();
        System.out.println(finalText.out(0));
        ArrayList<String> answer = new ArrayList<String>();
        answer = new SortText().sortWords((Composite) finalText);
        for (int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }

    @Test
    public void TestLexemSort(){
        String originalText = "It has survived - not only (five) centuries, but also the leap into 13<<2 electronic typesetting, " +
                "remaining 30>>>3 essentially ~6&9|(3&4) unchanged. It was popularised in the 5|(1&2&(3|(4&(25^5|6&47)|3)|2)|1) " +
                "with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum...\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking " +
                "at its layout. The point of using (~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78 Ipsum is that it has a more-or-less " +
                "normal distribution of letters, as opposed to using (Content here), content here', making it look like " +
                "readable English.\n\t It is a (8^5|1&2<<(2|5>>2&71))|1200 established fact that a reader will be of a page " +
                "when looking at its layout.\n";
        ParSeparation separation = new ParSeparation(originalText);
        Component finalText = separation.handleRequest();
        System.out.println(finalText.out(0));
        ArrayList<String> answer = new ArrayList<String>();
        answer = new SortText().sortLexem((Composite) finalText, 'i');
        for (int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
}
