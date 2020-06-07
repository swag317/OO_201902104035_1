//201902104035王兆娣
public interface CanBeAttacked extends OverlapSensitive{
    //被攻击时的行为
    void attacked(CanAttack attacker);
}
