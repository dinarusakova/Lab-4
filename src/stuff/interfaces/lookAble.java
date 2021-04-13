package stuff.interfaces;

import stuff.Entity;
import stuff.Enums.Adverbs;

public interface lookAble {
    void look(Object how);

    void notice(Entity entity);

    void seeShorties(Adverbs how);
}
