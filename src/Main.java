public class Main {
	
	public static void main(String[] args) {
		
		CollageProcessor collageProcessor = new CollageProcessor();
		
//		collageProcessor.prepareCollageImages("images/collage");
		
		collageProcessor.loadInitialImage("images/init/img.jpg");
		
//		collageProcessor.loadCollageImages("images/collage");

		collageProcessor.createCollage(100, 50, true);
		
//		collageProcessor.saveImageToFile(collageProcessor.initialImage, "images/result/img.jpg");
		
	}
}
