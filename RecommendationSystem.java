import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

import java.io.File;
import java.util.List;

public class RecommendationSystem {
    public static void main(String[] args) throws Exception {
        // Load dataset
        DataModel model = new FileDataModel(new File("dataset.csv"));

        // Compute user similarity
        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

        // Create neighborhood of 2 users
        UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);

        // Create recommender
        Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

        // Get recommendations for user ID 1
        List<RecommendedItem> recommendations = recommender.recommend(1, 2);

        // Show results
        for (RecommendedItem recommendation : recommendations) {
            System.out.println("Recommended item ID: " + recommendation.getItemID() +
                               " with value: " + recommendation.getValue());
        }
    }
}
