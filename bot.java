public class Bot
{
        public static class inputParameters {
                public int natureTokens;
                public int currentScore;
                public Object[] cards;
        }

        public static class hiddenLayer1 {
                public int[] weights;
                public int[] biases;
        }

        public static class hiddenLayer2 {
                public int[] weights;
                public int[] biases;
        }

        public static class outputParameters {
                public Move move;
        }

        public void calculate(int natureTokens, int currentScore, Object[] cards) {
                inputParameters input = new inputParameters();
                input.natureTokens = natureTokens;
                input.currentScore = currentScore;
                input.cards = cards;

                hiddenLayer1 hidden1 = new hiddenLayer1();
                // Define your weights and biases here.

                hiddenLayer2 hidden2 = new hiddenLayer2();
                // Define your weights and biases here.

                outputParameters output = new outputParameters();
                // Define your output here, based on the weights and biases.

                // https://towardsdatascience.com/what-does-weights-biases-do-c060ce6b4b8e
        }
}
