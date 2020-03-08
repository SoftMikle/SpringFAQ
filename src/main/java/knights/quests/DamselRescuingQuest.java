package knights.quests;

import knights.interfaces.Quest;

public class DamselRescuingQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Lady is saved, pike is warmed!");
    }
}
