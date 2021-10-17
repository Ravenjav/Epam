package by.epam.circle.entity;

import java.util.ArrayList;

public interface CubeRepositoryI {
    public void safe(Cube cube);
    public ArrayList<Cube> getAll();
    public ArrayList<Cube> findSameSquare(int square);
}
