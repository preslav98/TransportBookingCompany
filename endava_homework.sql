CREATE TABLE `vehicles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `brand` enum('MERCEDES','AIRBUS','AUDI','BMW') NOT NULL,
  `capacity` int NOT NULL,
  `fuel_usage` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
SELECT * FROM endava_homework.vehicles;