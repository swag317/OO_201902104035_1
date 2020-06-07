//201902104035王兆娣
public interface CanAttack extends OverlapSensitive{
    //受到反击
    void beCounterAttacked(int counterAttackDamageFromVictim);
    //攻击时的杀伤力
    int getDamage();
}
