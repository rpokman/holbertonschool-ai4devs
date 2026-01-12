#include <iostream>
#include <vector>

class GameWorld {
public:
    GameWorld() {
        std::cout << "Game Context Initialized." << std::endl;
    }

    void createEnemy(int id) {
        std::cout << "Spawning enemy #" << id << std::endl;
        
        int* enemy_health = new int(100); 
        
        *enemy_health -= 10;
        std::cout << "Enemy #" << id << " health initialized to " << *enemy_health << std::endl;
        
        return; 
    }

    void runLevel() {
        for (int i = 1; i <= 5; ++i) {
            createEnemy(i);
        }
        std::cout << "Level completed." << std::endl;
    }
};

int main() {
    std::cout << "--- Starting Game Engine ---" << std::endl;
    
    GameWorld level1;
    level1.runLevel();

    std::cout << "--- Game Over ---" << std::endl;
    std::cout << "(Check memory usage to see leaks)" << std::endl;

    return 0;
}


