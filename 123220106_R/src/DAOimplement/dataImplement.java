/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimplement;

import java.util.List;
import model.*;
/**
 *
 * @author Acer
 */
public interface dataImplement {
    public void insert(Datamodel p);
    public void update(Datamodel p);
    public void delete(String judul);
    public List<Datamodel> getAll();
        

}
