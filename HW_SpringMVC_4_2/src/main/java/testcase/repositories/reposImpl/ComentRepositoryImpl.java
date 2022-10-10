package testcase.repositories.reposImpl;

import org.springframework.stereotype.Repository;
import testcase.models.Comment;
import testcase.repositories.ComentRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Repository
public class ComentRepositoryImpl implements ComentRepository {
    private static final String PATH = "src/main/resources/userComments.txt";
    private static final File FILE = new File(PATH);

    @Override
    public int addComments(Comment comment) {
        int amountComments = getAmountComments() + 1;
        try (FileWriter writer = new FileWriter(FILE, true)) {
            writer.write(String.valueOf(amountComments).concat("|").concat(comment.getName()).concat("|").
                    concat(comment.getDescription()).concat("\n"));
        } catch (IOException e) {
            e.printStackTrace();
            amountComments = 0;
        }
        return amountComments;
    }

    @Override
    public List<Comment> getAllComments() {
        List<Comment> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(FILE)) {
            while (scanner.hasNext()) {
                String rowFile = scanner.nextLine();
                String[] tempData = rowFile.split("[|]");
                Comment comment = new Comment(Integer.parseInt(tempData[0]), tempData[1], tempData[2]);
                list.add(comment);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int getAmountComments() {
        int amountComments = 0;
        try (Scanner scanner = new Scanner(FILE)) {
            while (scanner.hasNext()) {
                amountComments++;
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return amountComments;
    }
}
