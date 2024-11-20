/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

/**
 *
 * @author varananavadiya
 */

import data.DataStore;
import java.util.Map;
import model.Comment;
import model.Post;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("Average number of likes per comments: " + likeNumber / commentNumber);
            
    }
    
        public void getMaxLikeCommentsPost() {    
        DataStore data = DataStore.getInstance();
        Comment commentWithMaxLikes = null;
        
        for (Comment c : data.getComments().values()) {
            if (commentWithMaxLikes == null) {
                commentWithMaxLikes = c; 
            }
            if (c.getLikes() > commentWithMaxLikes.getLikes()) {
                commentWithMaxLikes = c;
            }
        
        }
        
        int postId = commentWithMaxLikes.getPostId();
        
        System.out.println("Q2 Post with most likes per comment : " + data.getPosts().get(postId).getPostId());
        
    }
            public void getPostWithMostComments() {
        DataStore data = DataStore.getInstance();
        Post postWithMostComments = null;
        for (Post p : data.getPosts().values()) {
            if (postWithMostComments == null) {
                postWithMostComments = p;
            }
            if (p.getComments().size() > postWithMostComments.getComments().size()) {
                postWithMostComments = p;
            }
        }
        
        System.out.println("Q3 Post with Most Comments " + postWithMostComments.getPostId());
        
    }
    
}
