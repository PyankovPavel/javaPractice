package Lesson4VlMorozov;


import Lesson4VlMorozov.items.Archer;
import Lesson4VlMorozov.items.SwordMan;
import Lesson4VlMorozov.items.Warrior;
import Lesson4VlMorozov.team.Team;
import Lesson4VlMorozov.weapons.Bow;
import Lesson4VlMorozov.weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archerTeam = new Team<>("Archers");
        archerTeam.addWarrior(new Archer("Vasya", new Bow()))
                .addWarrior(new Archer("Petya", new Bow()))
                .addWarrior(new Archer("Misha", new Bow()))
                .addWarrior(new Archer("Grisha", new Bow()));

        System.out.println(archerTeam);

        Team<Warrior> mixTeam = new Team<>("Mixer");
        mixTeam.addWarrior(new Archer("Vasya", new Bow()))
                .addWarrior(new SwordMan("Petya", new Sword()))
                .addWarrior(new Archer("Misha", new Bow()))
                .addWarrior(new SwordMan("Grisha", new Sword()));

        System.out.println(mixTeam);

        SwordMan greg = new SwordMan("Petya", new Sword());
        Archer misha = new Archer("Misha", new Bow());

        while (greg.getHealthPoint() > 0 && misha.getHealthPoint() > 0) {
            int damage2 = misha.hitDamage(greg);
            int damage1 = greg.hitDamage(misha);
            System.out.printf("Здоровье Гриши: %d Здоровье Миши: %d \n", greg.getHealthPoint(), misha.getHealthPoint());
        }

        if (greg.getHealthPoint()>0)
            System.out.println("Гриша победил");
        else
            System.out.println("Миша победил");
    }
}
