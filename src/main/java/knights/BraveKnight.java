package knights;

import knights.interfaces.Quest;

public class BraveKnight {
    private String name = "BraveKnight";
    private Quest quest;
    private String message;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
