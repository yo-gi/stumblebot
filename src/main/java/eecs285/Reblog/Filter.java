package eecs285.Reblog;

import com.tumblr.jumblr.types.Post;
import eecs285.App;

import java.util.List;

// Yogesh <-
public class Filter
{
  static List<Post> postsToReblog(List<Post> inPosts)
  {
    return App.globalPosts;
  }
  
  static List<String> tagsFromPost(Post inPost)
  {
    return inPost.getTags();
  }
  
  static String titleForPost(Post inPost)
  {
    return inPost.getBlogName() + " Repost";
  }
}
