public class Game {

    private String enemyName;

    private int id;

    private int enemyHealth;

    private int enemyAttack;

    private int unlockLevel;

    private int weight;

    public Game() {
    }

    public Game(String enemyName, int id, int enemyHealth, int enemyAttack, int unlockLevel, int weight) {
        this.enemyName = enemyName;
        this.id = id;
        this.enemyHealth = enemyHealth;
        this.enemyAttack = enemyAttack;
        this.unlockLevel = unlockLevel;
        this.weight = weight;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyAttack() {
        return enemyAttack;
    }

    public void setEnemyAttack(int enemyAttack) {
        this.enemyAttack = enemyAttack;
    }

    public int getUnlockLevel() {
        return unlockLevel;
    }

    public void setUnlockLevel(int unlockLevel) {
        this.unlockLevel = unlockLevel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Game{" +
                "enemyName='" + enemyName + '\'' +
                ", id=" + id +
                ", enemyHealth=" + enemyHealth +
                ", enemyAttack=" + enemyAttack +
                ", unlockLevel=" + unlockLevel +
                ", weight=" + weight +
                '}';
    }

}
