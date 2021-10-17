package by.epam.circle.entity;

import by.epam.circle.service.valid.CubeSquare;

import java.util.ArrayList;

public class CubeRepository implements CubeRepositoryI{
    private ArrayList<Cube> cubeRep;

    CubeRepository(ArrayList<Cube> cubes){
        this.cubeRep = cubes;
    }

    public void safe(Cube cube){
        cubeRep.add(cube);
    }

    public ArrayList<Cube> getAll(){
        return cubeRep;
    }

    public ArrayList<Cube> findSameSquare(int square){
        ArrayList<Cube> out = new ArrayList<Cube>();
        for (int i = 0; i < cubeRep.size(); i++){
            if ( square == new CubeSquare().square(cubeRep.get(i))){
                out.add(cubeRep.get(i));
            }
        }
        return cubeRep;
    }
}
