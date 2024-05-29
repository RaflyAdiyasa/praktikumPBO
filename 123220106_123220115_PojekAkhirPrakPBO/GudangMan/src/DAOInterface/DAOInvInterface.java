package DAOInterface;

import Model.DataInv;
import java.util.List;

public interface DAOInvInterface {
    public void insert(DataInv di);
    public void update(DataInv di);
    public void delete(int id);
    public List<DataInv> getAll();
    public List<DataInv> search(String nama);
}
