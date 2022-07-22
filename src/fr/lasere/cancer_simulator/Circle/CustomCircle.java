
package fr.lasere.cancer_simulator.Circle;

import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CustomCircle {

	private final double WIDTH = 1025;
	private final double HEIGHT = 650;
	
	private Random rand = new Random();
	
	public Circle propertyCell(Circle cell, double X, double Y) {
		int random = rand.nextInt((15 - 7) + 7) + 7;
		cell.setCenterX(X + random);
		cell.setCenterY(Y + random);
		cell.setRadius(5);
		cell.setFill(Color.LIME);
		return cell;
	} 
	//if you have ideas to optimize this part of the code I am an advocate...
	public Circle[] init_bottom_cells() {
        Circle cell0 = new Circle();
        cell0 = propertyCell(cell0, WIDTH-0, HEIGHT);

        Circle cell1 = new Circle();
        cell1 = propertyCell(cell1, WIDTH-20, HEIGHT);
        
        Circle cell2 = new Circle();
        cell2 = propertyCell(cell2, WIDTH-40, HEIGHT);

        Circle cell3 = new Circle();
        cell3 = propertyCell(cell3, WIDTH-60, HEIGHT);

        Circle cell4 = new Circle();
        cell4 = propertyCell(cell4, WIDTH-80, HEIGHT);

        Circle cell5 = new Circle();
        cell5 = propertyCell(cell5, WIDTH-100, HEIGHT);

        Circle cell6 = new Circle();
        cell6 = propertyCell(cell6, WIDTH-120, HEIGHT);

        Circle cell7 = new Circle();
        cell7 = propertyCell(cell7, WIDTH-140, HEIGHT);

        Circle cell8 = new Circle();
        cell8 = propertyCell(cell8, WIDTH-160, HEIGHT);

        Circle cell9 = new Circle();
        cell9 = propertyCell(cell9, WIDTH-180, HEIGHT);

        Circle cell10 = new Circle();
        cell10 = propertyCell(cell10, WIDTH-200, HEIGHT);

        Circle cell11 = new Circle();
        cell11 = propertyCell(cell11, WIDTH-220, HEIGHT);

        Circle cell12 = new Circle();
        cell12 = propertyCell(cell12, WIDTH-240, HEIGHT);

        Circle cell13 = new Circle();
        cell13 = propertyCell(cell13, WIDTH-260, HEIGHT);

        Circle cell14 = new Circle();
        cell14 = propertyCell(cell14, WIDTH-280, HEIGHT);

        Circle cell15 = new Circle();
        cell15 = propertyCell(cell15, WIDTH-300, HEIGHT);

        Circle cell16 = new Circle();
        cell16 = propertyCell(cell16, WIDTH-320, HEIGHT);

        Circle cell17 = new Circle();
        cell17 = propertyCell(cell17, WIDTH-340, HEIGHT);

        Circle cell18 = new Circle();
        cell18 = propertyCell(cell18, WIDTH-360, HEIGHT);

        Circle cell19 = new Circle();
        cell19 = propertyCell(cell19, WIDTH-380, HEIGHT);

        Circle cell20 = new Circle();
        cell20 = propertyCell(cell20, WIDTH-400, HEIGHT);

        Circle cell21 = new Circle();
        cell21 = propertyCell(cell21, WIDTH-420, HEIGHT);

        Circle cell22 = new Circle();
        cell22 = propertyCell(cell22, WIDTH-440, HEIGHT);

        Circle cell23 = new Circle();
        cell23 = propertyCell(cell23, WIDTH-460, HEIGHT);

        Circle cell24 = new Circle();
        cell24 = propertyCell(cell24, WIDTH-480, HEIGHT);

        Circle cell25 = new Circle();
        cell25 = propertyCell(cell25, WIDTH-500, HEIGHT);

        Circle cell26 = new Circle();
        cell26 = propertyCell(cell26, WIDTH-520, HEIGHT);

        Circle cell27 = new Circle();
        cell27 = propertyCell(cell27, WIDTH-540, HEIGHT);

        Circle cell28 = new Circle();
        cell28 = propertyCell(cell28, WIDTH-560, HEIGHT);

        Circle cell29 = new Circle();
        cell29 = propertyCell(cell29, WIDTH-580, HEIGHT);

        Circle cell30 = new Circle();
        cell30 = propertyCell(cell30, WIDTH-600, HEIGHT);

        Circle cell31 = new Circle();
        cell31 = propertyCell(cell31, WIDTH-620, HEIGHT);

        Circle cell32 = new Circle();
        cell32 = propertyCell(cell32, WIDTH-640, HEIGHT);

        Circle cell33 = new Circle();
        cell33 = propertyCell(cell33, WIDTH-660, HEIGHT);

        Circle cell34 = new Circle();
        cell34 = propertyCell(cell34, WIDTH-680, HEIGHT);

        Circle cell35 = new Circle();
        cell35 = propertyCell(cell35, WIDTH-700, HEIGHT);

        Circle cell36 = new Circle();
        cell36 = propertyCell(cell36, WIDTH-720, HEIGHT);

        Circle cell37 = new Circle();
        cell37 = propertyCell(cell37, WIDTH-740, HEIGHT);

        Circle cell38 = new Circle();
        cell38 = propertyCell(cell38, WIDTH-760, HEIGHT);

        Circle cell39 = new Circle();
        cell39 = propertyCell(cell39, WIDTH-780, HEIGHT);

        Circle cell40 = new Circle();
        cell40 = propertyCell(cell40, WIDTH-800, HEIGHT);

        Circle cell41 = new Circle();
        cell41 = propertyCell(cell41, WIDTH-820, HEIGHT);

        Circle cell42 = new Circle();
        cell42 = propertyCell(cell42, WIDTH-840, HEIGHT);

        Circle cell43 = new Circle();
        cell43 = propertyCell(cell43, WIDTH-860, HEIGHT);

        Circle cell44 = new Circle();
        cell44 = propertyCell(cell44, WIDTH-880, HEIGHT);

        Circle cell45 = new Circle();
        cell45 = propertyCell(cell45, WIDTH-900, HEIGHT);

        Circle cell46 = new Circle();
        cell46 = propertyCell(cell46, WIDTH-920, HEIGHT);

        Circle cell47 = new Circle();
        cell47 = propertyCell(cell47, WIDTH-940, HEIGHT);

        Circle cell48 = new Circle();
        cell48 = propertyCell(cell48, WIDTH-960, HEIGHT);

        Circle cell49 = new Circle();
        cell49 = propertyCell(cell49, WIDTH-980, HEIGHT);

        Circle cell50 = new Circle();
        cell50 = propertyCell(cell50, WIDTH-0, HEIGHT-25);

        Circle cell51 = new Circle();
        cell51 = propertyCell(cell51, WIDTH-20, HEIGHT-25);

        Circle cell52 = new Circle();
        cell52 = propertyCell(cell52, WIDTH-40, HEIGHT-25);

        Circle cell53 = new Circle();
        cell53 = propertyCell(cell53, WIDTH-60, HEIGHT-25);

        Circle cell54 = new Circle();
        cell54 = propertyCell(cell54, WIDTH-80, HEIGHT-25);

        Circle cell55 = new Circle();
        cell55 = propertyCell(cell55, WIDTH-100, HEIGHT-25);

        Circle cell56 = new Circle();
        cell56 = propertyCell(cell56, WIDTH-120, HEIGHT-25);

        Circle cell57 = new Circle();
        cell57 = propertyCell(cell57, WIDTH-140, HEIGHT-25);

        Circle cell58 = new Circle();
        cell58 = propertyCell(cell58, WIDTH-160, HEIGHT-25);

        Circle cell59 = new Circle();
        cell59 = propertyCell(cell59, WIDTH-180, HEIGHT-25);

        Circle cell60 = new Circle();
        cell60 = propertyCell(cell60, WIDTH-200, HEIGHT-25);

        Circle cell61 = new Circle();
        cell61 = propertyCell(cell61, WIDTH-220, HEIGHT-25);

        Circle cell62 = new Circle();
        cell62 = propertyCell(cell62, WIDTH-240, HEIGHT-25);

        Circle cell63 = new Circle();
        cell63 = propertyCell(cell63, WIDTH-260, HEIGHT-25);

        Circle cell64 = new Circle();
        cell64 = propertyCell(cell64, WIDTH-280, HEIGHT-25);

        Circle cell65 = new Circle();
        cell65 = propertyCell(cell65, WIDTH-300, HEIGHT-25);

        Circle cell66 = new Circle();
        cell66 = propertyCell(cell66, WIDTH-320, HEIGHT-25);

        Circle cell67 = new Circle();
        cell67 = propertyCell(cell67, WIDTH-340, HEIGHT-25);

        Circle cell68 = new Circle();
        cell68 = propertyCell(cell68, WIDTH-360, HEIGHT-25);

        Circle cell69 = new Circle();
        cell69 = propertyCell(cell69, WIDTH-380, HEIGHT-25);

        Circle cell70 = new Circle();
        cell70 = propertyCell(cell70, WIDTH-400, HEIGHT-25);

        Circle cell71 = new Circle();
        cell71 = propertyCell(cell71, WIDTH-420, HEIGHT-25);

        Circle cell72 = new Circle();
        cell72 = propertyCell(cell72, WIDTH-440, HEIGHT-25);

        Circle cell73 = new Circle();
        cell73 = propertyCell(cell73, WIDTH-460, HEIGHT-25);

        Circle cell74 = new Circle();
        cell74 = propertyCell(cell74, WIDTH-480, HEIGHT-25);

        Circle cell75 = new Circle();
        cell75 = propertyCell(cell75, WIDTH-500, HEIGHT-25);

        Circle cell76 = new Circle();
        cell76 = propertyCell(cell76, WIDTH-520, HEIGHT-25);

        Circle cell77 = new Circle();
        cell77 = propertyCell(cell77, WIDTH-540, HEIGHT-25);

        Circle cell78 = new Circle();
        cell78 = propertyCell(cell78, WIDTH-560, HEIGHT-25);

        Circle cell79 = new Circle();
        cell79 = propertyCell(cell79, WIDTH-580, HEIGHT-25);

        Circle cell80 = new Circle();
        cell80 = propertyCell(cell80, WIDTH-600, HEIGHT-25);

        Circle cell81 = new Circle();
        cell81 = propertyCell(cell81, WIDTH-620, HEIGHT-25);

        Circle cell82 = new Circle();
        cell82 = propertyCell(cell82, WIDTH-640, HEIGHT-25);

        Circle cell83 = new Circle();
        cell83 = propertyCell(cell83, WIDTH-660, HEIGHT-25);

        Circle cell84 = new Circle();
        cell84 = propertyCell(cell84, WIDTH-680, HEIGHT-25);

        Circle cell85 = new Circle();
        cell85 = propertyCell(cell85, WIDTH-700, HEIGHT-25);

        Circle cell86 = new Circle();
        cell86 = propertyCell(cell86, WIDTH-720, HEIGHT-25);

        Circle cell87 = new Circle();
        cell87 = propertyCell(cell87, WIDTH-740, HEIGHT-25);

        Circle cell88 = new Circle();
        cell88 = propertyCell(cell88, WIDTH-760, HEIGHT-25);

        Circle cell89 = new Circle();
        cell89 = propertyCell(cell89, WIDTH-780, HEIGHT-25);

        Circle cell90 = new Circle();
        cell90 = propertyCell(cell90, WIDTH-800, HEIGHT-25);

        Circle cell91 = new Circle();
        cell91 = propertyCell(cell91, WIDTH-820, HEIGHT-25);

        Circle cell92 = new Circle();
        cell92 = propertyCell(cell92, WIDTH-840, HEIGHT-25);

        Circle cell93 = new Circle();
        cell93 = propertyCell(cell93, WIDTH-860, HEIGHT-25);

        Circle cell94 = new Circle();
        cell94 = propertyCell(cell94, WIDTH-880, HEIGHT-25);

        Circle cell95 = new Circle();
        cell95 = propertyCell(cell95, WIDTH-900, HEIGHT-25);

        Circle cell96 = new Circle();
        cell96 = propertyCell(cell96, WIDTH-920, HEIGHT-25);

        Circle cell97 = new Circle();
        cell97 = propertyCell(cell97, WIDTH-940, HEIGHT-25);

        Circle cell98 = new Circle();
        cell98 = propertyCell(cell98, WIDTH-960, HEIGHT-25);

        Circle cell99 = new Circle();
        cell99 = propertyCell(cell99, WIDTH-0, HEIGHT-50);

        Circle cell100 = new Circle();
        cell100 = propertyCell(cell100, WIDTH-20, HEIGHT-50);

        Circle cell101 = new Circle();
        cell101 = propertyCell(cell101, WIDTH-40, HEIGHT-50);

        Circle cell102 = new Circle();
        cell102 = propertyCell(cell102, WIDTH-60, HEIGHT-50);

        Circle cell103 = new Circle();
        cell103 = propertyCell(cell103, WIDTH-80, HEIGHT-50);

        Circle cell104 = new Circle();
        cell104 = propertyCell(cell104, WIDTH-100, HEIGHT-50);

        Circle cell105 = new Circle();
        cell105 = propertyCell(cell105, WIDTH-120, HEIGHT-50);

        Circle cell106 = new Circle();
        cell106 = propertyCell(cell106, WIDTH-140, HEIGHT-50);

        Circle cell107 = new Circle();
        cell107 = propertyCell(cell107, WIDTH-160, HEIGHT-50);

        Circle cell108 = new Circle();
        cell108 = propertyCell(cell108, WIDTH-180, HEIGHT-50);

        Circle cell109 = new Circle();
        cell109 = propertyCell(cell109, WIDTH-200, HEIGHT-50);

        Circle cell110 = new Circle();
        cell110 = propertyCell(cell110, WIDTH-220, HEIGHT-50);

        Circle cell111 = new Circle();
        cell111 = propertyCell(cell111, WIDTH-240, HEIGHT-50);

        Circle cell112 = new Circle();
        cell112 = propertyCell(cell112, WIDTH-260, HEIGHT-50);

        Circle cell113 = new Circle();
        cell113 = propertyCell(cell113, WIDTH-280, HEIGHT-50);

        Circle cell114 = new Circle();
        cell114 = propertyCell(cell114, WIDTH-300, HEIGHT-50);

        Circle cell115 = new Circle();
        cell115 = propertyCell(cell115, WIDTH-320, HEIGHT-50);

        Circle cell116 = new Circle();
        cell116 = propertyCell(cell116, WIDTH-340, HEIGHT-50);

        Circle cell117 = new Circle();
        cell117 = propertyCell(cell117, WIDTH-360, HEIGHT-50);

        Circle cell118 = new Circle();
        cell118 = propertyCell(cell118, WIDTH-380, HEIGHT-50);

        Circle cell119 = new Circle();
        cell119 = propertyCell(cell119, WIDTH-400, HEIGHT-50);

        Circle cell120 = new Circle();
        cell120 = propertyCell(cell120, WIDTH-420, HEIGHT-50);

        Circle cell121 = new Circle();
        cell121 = propertyCell(cell121, WIDTH-440, HEIGHT-50);

        Circle cell122 = new Circle();
        cell122 = propertyCell(cell122, WIDTH-460, HEIGHT-50);

        Circle cell123 = new Circle();
        cell123 = propertyCell(cell123, WIDTH-480, HEIGHT-50);

        Circle cell124 = new Circle();
        cell124 = propertyCell(cell124, WIDTH-500, HEIGHT-50);

        Circle cell125 = new Circle();
        cell125 = propertyCell(cell125, WIDTH-520, HEIGHT-50);

        Circle cell126 = new Circle();
        cell126 = propertyCell(cell126, WIDTH-540, HEIGHT-50);

        Circle cell127 = new Circle();
        cell127 = propertyCell(cell127, WIDTH-560, HEIGHT-50);

        Circle cell128 = new Circle();
        cell128 = propertyCell(cell128, WIDTH-580, HEIGHT-50);

        Circle cell129 = new Circle();
        cell129 = propertyCell(cell129, WIDTH-600, HEIGHT-50);

        Circle cell130 = new Circle();
        cell130 = propertyCell(cell130, WIDTH-620, HEIGHT-50);

        Circle cell131 = new Circle();
        cell131 = propertyCell(cell131, WIDTH-640, HEIGHT-50);

        Circle cell132 = new Circle();
        cell132 = propertyCell(cell132, WIDTH-660, HEIGHT-50);

        Circle cell133 = new Circle();
        cell133 = propertyCell(cell133, WIDTH-680, HEIGHT-50);

        Circle cell134 = new Circle();
        cell134 = propertyCell(cell134, WIDTH-700, HEIGHT-50);

        Circle cell135 = new Circle();
        cell135 = propertyCell(cell135, WIDTH-720, HEIGHT-50);

        Circle cell136 = new Circle();
        cell136 = propertyCell(cell136, WIDTH-740, HEIGHT-50);

        Circle cell137 = new Circle();
        cell137 = propertyCell(cell137, WIDTH-760, HEIGHT-50);

        Circle cell138 = new Circle();
        cell138 = propertyCell(cell138, WIDTH-780, HEIGHT-50);

        Circle cell139 = new Circle();
        cell139 = propertyCell(cell139, WIDTH-800, HEIGHT-50);

        Circle cell140 = new Circle();
        cell140 = propertyCell(cell140, WIDTH-820, HEIGHT-50);

        Circle cell141 = new Circle();
        cell141 = propertyCell(cell141, WIDTH-840, HEIGHT-50);

        Circle cell142 = new Circle();
        cell142 = propertyCell(cell142, WIDTH-860, HEIGHT-50);

        Circle cell143 = new Circle();
        cell143 = propertyCell(cell143, WIDTH-880, HEIGHT-50);

        Circle cell144 = new Circle();
        cell144 = propertyCell(cell144, WIDTH-900, HEIGHT-50);

        Circle cell145 = new Circle();
        cell145 = propertyCell(cell145, WIDTH-920, HEIGHT-50);

        Circle cell146 = new Circle();
        cell146 = propertyCell(cell146, WIDTH-940, HEIGHT-50);

        Circle cell147 = new Circle();
        cell147 = propertyCell(cell147, WIDTH-960, HEIGHT-50);

        Circle cell148 = new Circle();
        cell148 = propertyCell(cell148, WIDTH-980, HEIGHT-50);

        Circle cell149 = new Circle();
        cell149 = propertyCell(cell149, WIDTH-0, HEIGHT-75);

        Circle cell150 = new Circle();
        cell150 = propertyCell(cell150, WIDTH-20, HEIGHT-75);

        Circle cell151 = new Circle();
        cell151 = propertyCell(cell151, WIDTH-40, HEIGHT-75);

        Circle cell152 = new Circle();
        cell152 = propertyCell(cell152, WIDTH-60, HEIGHT-75);

        Circle cell153 = new Circle();
        cell153 = propertyCell(cell153, WIDTH-80, HEIGHT-75);

        Circle cell154 = new Circle();
        cell154 = propertyCell(cell154, WIDTH-100, HEIGHT-75);

        Circle cell155 = new Circle();
        cell155 = propertyCell(cell155, WIDTH-120, HEIGHT-75);

        Circle cell156 = new Circle();
        cell156 = propertyCell(cell156, WIDTH-140, HEIGHT-75);

        Circle cell157 = new Circle();
        cell157 = propertyCell(cell157, WIDTH-160, HEIGHT-75);

        Circle cell158 = new Circle();
        cell158 = propertyCell(cell158, WIDTH-180, HEIGHT-75);

        Circle cell159 = new Circle();
        cell159 = propertyCell(cell159, WIDTH-200, HEIGHT-75);

        Circle cell160 = new Circle();
        cell160 = propertyCell(cell160, WIDTH-220, HEIGHT-75);

        Circle cell161 = new Circle();
        cell161 = propertyCell(cell161, WIDTH-240, HEIGHT-75);

        Circle cell162 = new Circle();
        cell162 = propertyCell(cell162, WIDTH-260, HEIGHT-75);

        Circle cell163 = new Circle();
        cell163 = propertyCell(cell163, WIDTH-280, HEIGHT-75);

        Circle cell164 = new Circle();
        cell164 = propertyCell(cell164, WIDTH-300, HEIGHT-75);

        Circle cell165 = new Circle();
        cell165 = propertyCell(cell165, WIDTH-320, HEIGHT-75);

        Circle cell166 = new Circle();
        cell166 = propertyCell(cell166, WIDTH-340, HEIGHT-75);

        Circle cell167 = new Circle();
        cell167 = propertyCell(cell167, WIDTH-360, HEIGHT-75);

        Circle cell168 = new Circle();
        cell168 = propertyCell(cell168, WIDTH-380, HEIGHT-75);

        Circle cell169 = new Circle();
        cell169 = propertyCell(cell169, WIDTH-400, HEIGHT-75);

        Circle cell170 = new Circle();
        cell170 = propertyCell(cell170, WIDTH-420, HEIGHT-75);

        Circle cell171 = new Circle();
        cell171 = propertyCell(cell171, WIDTH-440, HEIGHT-75);

        Circle cell172 = new Circle();
        cell172 = propertyCell(cell172, WIDTH-460, HEIGHT-75);

        Circle cell173 = new Circle();
        cell173 = propertyCell(cell173, WIDTH-480, HEIGHT-75);

        Circle cell174 = new Circle();
        cell174 = propertyCell(cell174, WIDTH-500, HEIGHT-75);

        Circle cell175 = new Circle();
        cell175 = propertyCell(cell175, WIDTH-520, HEIGHT-75);

        Circle cell176 = new Circle();
        cell176 = propertyCell(cell176, WIDTH-540, HEIGHT-75);

        Circle cell177 = new Circle();
        cell177 = propertyCell(cell177, WIDTH-560, HEIGHT-75);

        Circle cell178 = new Circle();
        cell178 = propertyCell(cell178, WIDTH-580, HEIGHT-75);

        Circle cell179 = new Circle();
        cell179 = propertyCell(cell179, WIDTH-600, HEIGHT-75);

        Circle cell180 = new Circle();
        cell180 = propertyCell(cell180, WIDTH-620, HEIGHT-75);

        Circle cell181 = new Circle();
        cell181 = propertyCell(cell181, WIDTH-640, HEIGHT-75);

        Circle cell182 = new Circle();
        cell182 = propertyCell(cell182, WIDTH-660, HEIGHT-75);

        Circle cell183 = new Circle();
        cell183 = propertyCell(cell183, WIDTH-680, HEIGHT-75);

        Circle cell184 = new Circle();
        cell184 = propertyCell(cell184, WIDTH-700, HEIGHT-75);

        Circle cell185 = new Circle();
        cell185 = propertyCell(cell185, WIDTH-720, HEIGHT-75);

        Circle cell186 = new Circle();
        cell186 = propertyCell(cell186, WIDTH-740, HEIGHT-75);

        Circle cell187 = new Circle();
        cell187 = propertyCell(cell187, WIDTH-760, HEIGHT-75);

        Circle cell188 = new Circle();
        cell188 = propertyCell(cell188, WIDTH-780, HEIGHT-75);

        Circle cell189 = new Circle();
        cell189 = propertyCell(cell189, WIDTH-800, HEIGHT-75);

        Circle cell190 = new Circle();
        cell190 = propertyCell(cell190, WIDTH-820, HEIGHT-75);

        Circle cell191 = new Circle();
        cell191 = propertyCell(cell191, WIDTH-840, HEIGHT-75);

        Circle cell192 = new Circle();
        cell192 = propertyCell(cell192, WIDTH-860, HEIGHT-75);

        Circle cell193 = new Circle();
        cell193 = propertyCell(cell193, WIDTH-880, HEIGHT-75);

        Circle cell194 = new Circle();
        cell194 = propertyCell(cell194, WIDTH-900, HEIGHT-75);

        Circle cell195 = new Circle();
        cell195 = propertyCell(cell195, WIDTH-920, HEIGHT-75);

        Circle cell196 = new Circle();
        cell196 = propertyCell(cell196, WIDTH-940, HEIGHT-75);

        Circle cell197 = new Circle();
        cell197 = propertyCell(cell197, WIDTH-960, HEIGHT-75);

        Circle cell198 = new Circle();
        cell198 = propertyCell(cell198, WIDTH-980, HEIGHT-75);

        Circle cell199 = new Circle();
        cell199 = propertyCell(cell199, WIDTH-0, HEIGHT-100);

        Circle cell200 = new Circle();
        cell200 = propertyCell(cell200, WIDTH-20, HEIGHT-100);

        Circle cell201 = new Circle();
        cell201 = propertyCell(cell201, WIDTH-40, HEIGHT-100);

        Circle cell202 = new Circle();
        cell202 = propertyCell(cell202, WIDTH-60, HEIGHT-100);

        Circle cell203 = new Circle();
        cell203 = propertyCell(cell203, WIDTH-80, HEIGHT-100);

        Circle cell204 = new Circle();
        cell204 = propertyCell(cell204, WIDTH-100, HEIGHT-100);

        Circle cell205 = new Circle();
        cell205 = propertyCell(cell205, WIDTH-120, HEIGHT-100);

        Circle cell206 = new Circle();
        cell206 = propertyCell(cell206, WIDTH-140, HEIGHT-100);

        Circle cell207 = new Circle();
        cell207 = propertyCell(cell207, WIDTH-160, HEIGHT-100);

        Circle cell208 = new Circle();
        cell208 = propertyCell(cell208, WIDTH-180, HEIGHT-100);

        Circle cell209 = new Circle();
        cell209 = propertyCell(cell209, WIDTH-200, HEIGHT-100);

        Circle cell210 = new Circle();
        cell210 = propertyCell(cell210, WIDTH-220, HEIGHT-100);

        Circle cell211 = new Circle();
        cell211 = propertyCell(cell211, WIDTH-240, HEIGHT-100);

        Circle cell212 = new Circle();
        cell212 = propertyCell(cell212, WIDTH-260, HEIGHT-100);

        Circle cell213 = new Circle();
        cell213 = propertyCell(cell213, WIDTH-280, HEIGHT-100);

        Circle cell214 = new Circle();
        cell214 = propertyCell(cell214, WIDTH-300, HEIGHT-100);

        Circle cell215 = new Circle();
        cell215 = propertyCell(cell215, WIDTH-320, HEIGHT-100);

        Circle cell216 = new Circle();
        cell216 = propertyCell(cell216, WIDTH-340, HEIGHT-100);

        Circle cell217 = new Circle();
        cell217 = propertyCell(cell217, WIDTH-360, HEIGHT-100);

        Circle cell218 = new Circle();
        cell218 = propertyCell(cell218, WIDTH-380, HEIGHT-100);

        Circle cell219 = new Circle();
        cell219 = propertyCell(cell219, WIDTH-400, HEIGHT-100);

        Circle cell220 = new Circle();
        cell220 = propertyCell(cell220, WIDTH-420, HEIGHT-100);

        Circle cell221 = new Circle();
        cell221 = propertyCell(cell221, WIDTH-440, HEIGHT-100);

        Circle cell222 = new Circle();
        cell222 = propertyCell(cell222, WIDTH-460, HEIGHT-100);

        Circle cell223 = new Circle();
        cell223 = propertyCell(cell223, WIDTH-480, HEIGHT-100);

        Circle cell224 = new Circle();
        cell224 = propertyCell(cell224, WIDTH-500, HEIGHT-100);

        Circle cell225 = new Circle();
        cell225 = propertyCell(cell225, WIDTH-520, HEIGHT-100);

        Circle cell226 = new Circle();
        cell226 = propertyCell(cell226, WIDTH-540, HEIGHT-100);

        Circle cell227 = new Circle();
        cell227 = propertyCell(cell227, WIDTH-560, HEIGHT-100);

        Circle cell228 = new Circle();
        cell228 = propertyCell(cell228, WIDTH-580, HEIGHT-100);

        Circle cell229 = new Circle();
        cell229 = propertyCell(cell229, WIDTH-600, HEIGHT-100);

        Circle cell230 = new Circle();
        cell230 = propertyCell(cell230, WIDTH-620, HEIGHT-100);

        Circle cell231 = new Circle();
        cell231 = propertyCell(cell231, WIDTH-640, HEIGHT-100);

        Circle cell232 = new Circle();
        cell232 = propertyCell(cell232, WIDTH-660, HEIGHT-100);

        Circle cell233 = new Circle();
        cell233 = propertyCell(cell233, WIDTH-680, HEIGHT-100);

        Circle cell234 = new Circle();
        cell234 = propertyCell(cell234, WIDTH-700, HEIGHT-100);

        Circle cell235 = new Circle();
        cell235 = propertyCell(cell235, WIDTH-720, HEIGHT-100);

        Circle cell236 = new Circle();
        cell236 = propertyCell(cell236, WIDTH-740, HEIGHT-100);

        Circle cell237 = new Circle();
        cell237 = propertyCell(cell237, WIDTH-760, HEIGHT-100);

        Circle cell238 = new Circle();
        cell238 = propertyCell(cell238, WIDTH-780, HEIGHT-100);

        Circle cell239 = new Circle();
        cell239 = propertyCell(cell239, WIDTH-800, HEIGHT-100);

        Circle cell240 = new Circle();
        cell240 = propertyCell(cell240, WIDTH-820, HEIGHT-100);

        Circle cell241 = new Circle();
        cell241 = propertyCell(cell241, WIDTH-840, HEIGHT-100);

        Circle cell242 = new Circle();
        cell242 = propertyCell(cell242, WIDTH-860, HEIGHT-100);

        Circle cell243 = new Circle();
        cell243 = propertyCell(cell243, WIDTH-880, HEIGHT-100);

        Circle cell244 = new Circle();
        cell244 = propertyCell(cell244, WIDTH-900, HEIGHT-100);

        Circle cell245 = new Circle();
        cell245 = propertyCell(cell245, WIDTH-920, HEIGHT-100);

        Circle cell246 = new Circle();
        cell246 = propertyCell(cell246, WIDTH-940, HEIGHT-100);

        Circle cell247 = new Circle();
        cell247 = propertyCell(cell247, WIDTH-960, HEIGHT-100);

        Circle cell248 = new Circle();
        cell248 = propertyCell(cell248, WIDTH-980, HEIGHT-100);

        Circle cell249 = new Circle();
        cell249 = propertyCell(cell249, WIDTH-0, HEIGHT-125);

        Circle cell250 = new Circle();
        cell250 = propertyCell(cell250, WIDTH-20, HEIGHT-125);

        Circle cell251 = new Circle();
        cell251 = propertyCell(cell251, WIDTH-40, HEIGHT-125);

        Circle cell252 = new Circle();
        cell252 = propertyCell(cell252, WIDTH-60, HEIGHT-125);

        Circle cell253 = new Circle();
        cell253 = propertyCell(cell253, WIDTH-80, HEIGHT-125);

        Circle cell254 = new Circle();
        cell254 = propertyCell(cell254, WIDTH-100, HEIGHT-125);

        Circle cell255 = new Circle();
        cell255 = propertyCell(cell255, WIDTH-120, HEIGHT-125);

        Circle cell256 = new Circle();
        cell256 = propertyCell(cell256, WIDTH-140, HEIGHT-125);

        Circle cell257 = new Circle();
        cell257 = propertyCell(cell257, WIDTH-160, HEIGHT-125);

        Circle cell258 = new Circle();
        cell258 = propertyCell(cell258, WIDTH-180, HEIGHT-125);

        Circle cell259 = new Circle();
        cell259 = propertyCell(cell259, WIDTH-200, HEIGHT-125);

        Circle cell260 = new Circle();
        cell260 = propertyCell(cell260, WIDTH-220, HEIGHT-125);

        Circle cell261 = new Circle();
        cell261 = propertyCell(cell261, WIDTH-240, HEIGHT-125);

        Circle cell262 = new Circle();
        cell262 = propertyCell(cell262, WIDTH-260, HEIGHT-125);

        Circle cell263 = new Circle();
        cell263 = propertyCell(cell263, WIDTH-280, HEIGHT-125);

        Circle cell264 = new Circle();
        cell264 = propertyCell(cell264, WIDTH-300, HEIGHT-125);

        Circle cell265 = new Circle();
        cell265 = propertyCell(cell265, WIDTH-320, HEIGHT-125);

        Circle cell266 = new Circle();
        cell266 = propertyCell(cell266, WIDTH-340, HEIGHT-125);

        Circle cell267 = new Circle();
        cell267 = propertyCell(cell267, WIDTH-360, HEIGHT-125);

        Circle cell268 = new Circle();
        cell268 = propertyCell(cell268, WIDTH-380, HEIGHT-125);

        Circle cell269 = new Circle();
        cell269 = propertyCell(cell269, WIDTH-400, HEIGHT-125);

        Circle cell270 = new Circle();
        cell270 = propertyCell(cell270, WIDTH-420, HEIGHT-125);

        Circle cell271 = new Circle();
        cell271 = propertyCell(cell271, WIDTH-440, HEIGHT-125);

        Circle cell272 = new Circle();
        cell272 = propertyCell(cell272, WIDTH-460, HEIGHT-125);

        Circle cell273 = new Circle();
        cell273 = propertyCell(cell273, WIDTH-480, HEIGHT-125);

        Circle cell274 = new Circle();
        cell274 = propertyCell(cell274, WIDTH-500, HEIGHT-125);

        Circle cell275 = new Circle();
        cell275 = propertyCell(cell275, WIDTH-520, HEIGHT-125);

        Circle cell276 = new Circle();
        cell276 = propertyCell(cell276, WIDTH-540, HEIGHT-125);

        Circle cell277 = new Circle();
        cell277 = propertyCell(cell277, WIDTH-560, HEIGHT-125);

        Circle cell278 = new Circle();
        cell278 = propertyCell(cell278, WIDTH-580, HEIGHT-125);

        Circle cell279 = new Circle();
        cell279 = propertyCell(cell279, WIDTH-600, HEIGHT-125);

        Circle cell280 = new Circle();
        cell280 = propertyCell(cell280, WIDTH-620, HEIGHT-125);

        Circle cell281 = new Circle();
        cell281 = propertyCell(cell281, WIDTH-640, HEIGHT-125);

        Circle cell282 = new Circle();
        cell282 = propertyCell(cell282, WIDTH-660, HEIGHT-125);

        Circle cell283 = new Circle();
        cell283 = propertyCell(cell283, WIDTH-680, HEIGHT-125);

        Circle cell284 = new Circle();
        cell284 = propertyCell(cell284, WIDTH-700, HEIGHT-125);

        Circle cell285 = new Circle();
        cell285 = propertyCell(cell285, WIDTH-720, HEIGHT-125);

        Circle cell286 = new Circle();
        cell286 = propertyCell(cell286, WIDTH-740, HEIGHT-125);

        Circle cell287 = new Circle();
        cell287 = propertyCell(cell287, WIDTH-760, HEIGHT-125);

        Circle cell288 = new Circle();
        cell288 = propertyCell(cell288, WIDTH-780, HEIGHT-125);

        Circle cell289 = new Circle();
        cell289 = propertyCell(cell289, WIDTH-800, HEIGHT-125);

        Circle cell290 = new Circle();
        cell290 = propertyCell(cell290, WIDTH-820, HEIGHT-125);

        Circle cell291 = new Circle();
        cell291 = propertyCell(cell291, WIDTH-840, HEIGHT-125);

        Circle cell292 = new Circle();
        cell292 = propertyCell(cell292, WIDTH-860, HEIGHT-125);

        Circle cell293 = new Circle();
        cell293 = propertyCell(cell293, WIDTH-880, HEIGHT-125);

        Circle cell294 = new Circle();
        cell294 = propertyCell(cell294, WIDTH-900, HEIGHT-125);

        Circle cell295 = new Circle();
        cell295 = propertyCell(cell295, WIDTH-920, HEIGHT-125);

        Circle cell296 = new Circle();
        cell296 = propertyCell(cell296, WIDTH-940, HEIGHT-125);

        Circle cell297 = new Circle();
        cell297 = propertyCell(cell297, WIDTH-960, HEIGHT-125);

        Circle cell298 = new Circle();
        cell298 = propertyCell(cell298, WIDTH-980, HEIGHT-125);

        Circle cell299 = new Circle();
        cell299 = propertyCell(cell299, WIDTH-0, HEIGHT-150);

        Circle cell300 = new Circle();
        cell300 = propertyCell(cell300, WIDTH-20, HEIGHT-150);

        Circle cell301 = new Circle();
        cell301 = propertyCell(cell301, WIDTH-40, HEIGHT-150);

        Circle cell302 = new Circle();
        cell302 = propertyCell(cell302, WIDTH-60, HEIGHT-150);

        Circle cell303 = new Circle();
        cell303 = propertyCell(cell303, WIDTH-80, HEIGHT-150);

        Circle cell304 = new Circle();
        cell304 = propertyCell(cell304, WIDTH-100, HEIGHT-150);

        Circle cell305 = new Circle();
        cell305 = propertyCell(cell305, WIDTH-120, HEIGHT-150);

        Circle cell306 = new Circle();
        cell306 = propertyCell(cell306, WIDTH-140, HEIGHT-150);

        Circle cell307 = new Circle();
        cell307 = propertyCell(cell307, WIDTH-160, HEIGHT-150);

        Circle cell308 = new Circle();
        cell308 = propertyCell(cell308, WIDTH-180, HEIGHT-150);

        Circle cell309 = new Circle();
        cell309 = propertyCell(cell309, WIDTH-200, HEIGHT-150);

        Circle cell310 = new Circle();
        cell310 = propertyCell(cell310, WIDTH-220, HEIGHT-150);

        Circle cell311 = new Circle();
        cell311 = propertyCell(cell311, WIDTH-240, HEIGHT-150);

        Circle cell312 = new Circle();
        cell312 = propertyCell(cell312, WIDTH-260, HEIGHT-150);

        Circle cell313 = new Circle();
        cell313 = propertyCell(cell313, WIDTH-280, HEIGHT-150);

        Circle cell314 = new Circle();
        cell314 = propertyCell(cell314, WIDTH-300, HEIGHT-150);

        Circle cell315 = new Circle();
        cell315 = propertyCell(cell315, WIDTH-320, HEIGHT-150);

        Circle cell316 = new Circle();
        cell316 = propertyCell(cell316, WIDTH-340, HEIGHT-150);

        Circle cell317 = new Circle();
        cell317 = propertyCell(cell317, WIDTH-360, HEIGHT-150);

        Circle cell318 = new Circle();
        cell318 = propertyCell(cell318, WIDTH-380, HEIGHT-150);

        Circle cell319 = new Circle();
        cell319 = propertyCell(cell319, WIDTH-400, HEIGHT-150);

        Circle cell320 = new Circle();
        cell320 = propertyCell(cell320, WIDTH-420, HEIGHT-150);

        Circle cell321 = new Circle();
        cell321 = propertyCell(cell321, WIDTH-440, HEIGHT-150);

        Circle cell322 = new Circle();
        cell322 = propertyCell(cell322, WIDTH-460, HEIGHT-150);

        Circle cell323 = new Circle();
        cell323 = propertyCell(cell323, WIDTH-480, HEIGHT-150);

        Circle cell324 = new Circle();
        cell324 = propertyCell(cell324, WIDTH-500, HEIGHT-150);

        Circle cell325 = new Circle();
        cell325 = propertyCell(cell325, WIDTH-520, HEIGHT-150);

        Circle cell326 = new Circle();
        cell326 = propertyCell(cell326, WIDTH-540, HEIGHT-150);

        Circle cell327 = new Circle();
        cell327 = propertyCell(cell327, WIDTH-560, HEIGHT-150);

        Circle cell328 = new Circle();
        cell328 = propertyCell(cell328, WIDTH-580, HEIGHT-150);

        Circle cell329 = new Circle();
        cell329 = propertyCell(cell329, WIDTH-600, HEIGHT-150);

        Circle cell330 = new Circle();
        cell330 = propertyCell(cell330, WIDTH-620, HEIGHT-150);

        Circle cell331 = new Circle();
        cell331 = propertyCell(cell331, WIDTH-640, HEIGHT-150);

        Circle cell332 = new Circle();
        cell332 = propertyCell(cell332, WIDTH-660, HEIGHT-150);

        Circle cell333 = new Circle();
        cell333 = propertyCell(cell333, WIDTH-680, HEIGHT-150);

        Circle cell334 = new Circle();
        cell334 = propertyCell(cell334, WIDTH-700, HEIGHT-150);

        Circle cell335 = new Circle();
        cell335 = propertyCell(cell335, WIDTH-720, HEIGHT-150);

        Circle cell336 = new Circle();
        cell336 = propertyCell(cell336, WIDTH-740, HEIGHT-150);

        Circle cell337 = new Circle();
        cell337 = propertyCell(cell337, WIDTH-760, HEIGHT-150);

        Circle cell338 = new Circle();
        cell338 = propertyCell(cell338, WIDTH-780, HEIGHT-150);

        Circle cell339 = new Circle();
        cell339 = propertyCell(cell339, WIDTH-800, HEIGHT-150);

        Circle cell340 = new Circle();
        cell340 = propertyCell(cell340, WIDTH-820, HEIGHT-150);

        Circle cell341 = new Circle();
        cell341 = propertyCell(cell341, WIDTH-840, HEIGHT-150);

        Circle cell342 = new Circle();
        cell342 = propertyCell(cell342, WIDTH-860, HEIGHT-150);

        Circle cell343 = new Circle();
        cell343 = propertyCell(cell343, WIDTH-880, HEIGHT-150);

        Circle cell344 = new Circle();
        cell344 = propertyCell(cell344, WIDTH-900, HEIGHT-150);

        Circle cell345 = new Circle();
        cell345 = propertyCell(cell345, WIDTH-920, HEIGHT-150);

        Circle cell346 = new Circle();
        cell346 = propertyCell(cell346, WIDTH-940, HEIGHT-150);

        Circle cell347 = new Circle();
        cell347 = propertyCell(cell347, WIDTH-960, HEIGHT-150);

        Circle cell348 = new Circle();
        cell348 = propertyCell(cell348, WIDTH-980, HEIGHT-150);

        Circle cell349 = new Circle();
        cell349 = propertyCell(cell349, WIDTH-0, HEIGHT-175);

        Circle cell350 = new Circle();
        cell350 = propertyCell(cell350, WIDTH-20, HEIGHT-175);

        Circle cell351 = new Circle();
        cell351 = propertyCell(cell351, WIDTH-40, HEIGHT-175);

        Circle cell352 = new Circle();
        cell352 = propertyCell(cell352, WIDTH-60, HEIGHT-175);

        Circle cell353 = new Circle();
        cell353 = propertyCell(cell353, WIDTH-80, HEIGHT-175);

        Circle cell354 = new Circle();
        cell354 = propertyCell(cell354, WIDTH-100, HEIGHT-175);

        Circle cell355 = new Circle();
        cell355 = propertyCell(cell355, WIDTH-120, HEIGHT-175);

        Circle cell356 = new Circle();
        cell356 = propertyCell(cell356, WIDTH-140, HEIGHT-175);

        Circle cell357 = new Circle();
        cell357 = propertyCell(cell357, WIDTH-160, HEIGHT-175);

        Circle cell358 = new Circle();
        cell358 = propertyCell(cell358, WIDTH-180, HEIGHT-175);

        Circle cell359 = new Circle();
        cell359 = propertyCell(cell359, WIDTH-200, HEIGHT-175);

        Circle cell360 = new Circle();
        cell360 = propertyCell(cell360, WIDTH-220, HEIGHT-175);

        Circle cell361 = new Circle();
        cell361 = propertyCell(cell361, WIDTH-240, HEIGHT-175);

        Circle cell362 = new Circle();
        cell362 = propertyCell(cell362, WIDTH-260, HEIGHT-175);

        Circle cell363 = new Circle();
        cell363 = propertyCell(cell363, WIDTH-280, HEIGHT-175);

        Circle cell364 = new Circle();
        cell364 = propertyCell(cell364, WIDTH-300, HEIGHT-175);

        Circle cell365 = new Circle();
        cell365 = propertyCell(cell365, WIDTH-320, HEIGHT-175);

        Circle cell366 = new Circle();
        cell366 = propertyCell(cell366, WIDTH-340, HEIGHT-175);

        Circle cell367 = new Circle();
        cell367 = propertyCell(cell367, WIDTH-360, HEIGHT-175);

        Circle cell368 = new Circle();
        cell368 = propertyCell(cell368, WIDTH-380, HEIGHT-175);

        Circle cell369 = new Circle();
        cell369 = propertyCell(cell369, WIDTH-400, HEIGHT-175);

        Circle cell370 = new Circle();
        cell370 = propertyCell(cell370, WIDTH-420, HEIGHT-175);

        Circle cell371 = new Circle();
        cell371 = propertyCell(cell371, WIDTH-440, HEIGHT-175);

        Circle cell372 = new Circle();
        cell372 = propertyCell(cell372, WIDTH-460, HEIGHT-175);

        Circle cell373 = new Circle();
        cell373 = propertyCell(cell373, WIDTH-480, HEIGHT-175);

        Circle cell374 = new Circle();
        cell374 = propertyCell(cell374, WIDTH-500, HEIGHT-175);

        Circle cell375 = new Circle();
        cell375 = propertyCell(cell375, WIDTH-520, HEIGHT-175);

        Circle cell376 = new Circle();
        cell376 = propertyCell(cell376, WIDTH-540, HEIGHT-175);

        Circle cell377 = new Circle();
        cell377 = propertyCell(cell377, WIDTH-560, HEIGHT-175);

        Circle cell378 = new Circle();
        cell378 = propertyCell(cell378, WIDTH-580, HEIGHT-175);

        Circle cell379 = new Circle();
        cell379 = propertyCell(cell379, WIDTH-600, HEIGHT-175);

        Circle cell380 = new Circle();
        cell380 = propertyCell(cell380, WIDTH-620, HEIGHT-175);

        Circle cell381 = new Circle();
        cell381 = propertyCell(cell381, WIDTH-640, HEIGHT-175);

        Circle cell382 = new Circle();
        cell382 = propertyCell(cell382, WIDTH-660, HEIGHT-175);

        Circle cell383 = new Circle();
        cell383 = propertyCell(cell383, WIDTH-680, HEIGHT-175);

        Circle cell384 = new Circle();
        cell384 = propertyCell(cell384, WIDTH-700, HEIGHT-175);

        Circle cell385 = new Circle();
        cell385 = propertyCell(cell385, WIDTH-720, HEIGHT-175);

        Circle cell386 = new Circle();
        cell386 = propertyCell(cell386, WIDTH-740, HEIGHT-175);

        Circle cell387 = new Circle();
        cell387 = propertyCell(cell387, WIDTH-760, HEIGHT-175);

        Circle cell388 = new Circle();
        cell388 = propertyCell(cell388, WIDTH-780, HEIGHT-175);

        Circle cell389 = new Circle();
        cell389 = propertyCell(cell389, WIDTH-800, HEIGHT-175);

        Circle cell390 = new Circle();
        cell390 = propertyCell(cell390, WIDTH-820, HEIGHT-175);

        Circle cell391 = new Circle();
        cell391 = propertyCell(cell391, WIDTH-840, HEIGHT-175);

        Circle cell392 = new Circle();
        cell392 = propertyCell(cell392, WIDTH-860, HEIGHT-175);

        Circle cell393 = new Circle();
        cell393 = propertyCell(cell393, WIDTH-880, HEIGHT-175);

        Circle cell394 = new Circle();
        cell394 = propertyCell(cell394, WIDTH-900, HEIGHT-175);

        Circle cell395 = new Circle();
        cell395 = propertyCell(cell395, WIDTH-920, HEIGHT-175);

        Circle cell396 = new Circle();
        cell396 = propertyCell(cell396, WIDTH-940, HEIGHT-175);

        Circle cell397 = new Circle();
        cell397 = propertyCell(cell397, WIDTH-960, HEIGHT-175);

        Circle cell398 = new Circle();
        cell398 = propertyCell(cell398, WIDTH-980, HEIGHT-175);

        Circle cell399 = new Circle();
        cell399 = propertyCell(cell399, WIDTH-0, HEIGHT-200);

        Circle cell400 = new Circle();
        cell400 = propertyCell(cell400, WIDTH-20, HEIGHT-200);

        Circle cell401 = new Circle();
        cell401 = propertyCell(cell401, WIDTH-40, HEIGHT-200);

        Circle cell402 = new Circle();
        cell402 = propertyCell(cell402, WIDTH-60, HEIGHT-200);

        Circle cell403 = new Circle();
        cell403 = propertyCell(cell403, WIDTH-80, HEIGHT-200);

        Circle cell404 = new Circle();
        cell404 = propertyCell(cell404, WIDTH-100, HEIGHT-200);

        Circle cell405 = new Circle();
        cell405 = propertyCell(cell405, WIDTH-120, HEIGHT-200);

        Circle cell406 = new Circle();
        cell406 = propertyCell(cell406, WIDTH-140, HEIGHT-200);

        Circle cell407 = new Circle();
        cell407 = propertyCell(cell407, WIDTH-160, HEIGHT-200);

        Circle cell408 = new Circle();
        cell408 = propertyCell(cell408, WIDTH-180, HEIGHT-200);

        Circle cell409 = new Circle();
        cell409 = propertyCell(cell409, WIDTH-200, HEIGHT-200);

        Circle cell410 = new Circle();
        cell410 = propertyCell(cell410, WIDTH-220, HEIGHT-200);

        Circle cell411 = new Circle();
        cell411 = propertyCell(cell411, WIDTH-240, HEIGHT-200);

        Circle cell412 = new Circle();
        cell412 = propertyCell(cell412, WIDTH-260, HEIGHT-200);

        Circle cell413 = new Circle();
        cell413 = propertyCell(cell413, WIDTH-280, HEIGHT-200);

        Circle cell414 = new Circle();
        cell414 = propertyCell(cell414, WIDTH-300, HEIGHT-200);

        Circle cell415 = new Circle();
        cell415 = propertyCell(cell415, WIDTH-320, HEIGHT-200);

        Circle cell416 = new Circle();
        cell416 = propertyCell(cell416, WIDTH-340, HEIGHT-200);

        Circle cell417 = new Circle();
        cell417 = propertyCell(cell417, WIDTH-360, HEIGHT-200);

        Circle cell418 = new Circle();
        cell418 = propertyCell(cell418, WIDTH-380, HEIGHT-200);

        Circle cell419 = new Circle();
        cell419 = propertyCell(cell419, WIDTH-400, HEIGHT-200);

        Circle cell420 = new Circle();
        cell420 = propertyCell(cell420, WIDTH-420, HEIGHT-200);

        Circle cell421 = new Circle();
        cell421 = propertyCell(cell421, WIDTH-440, HEIGHT-200);

        Circle cell422 = new Circle();
        cell422 = propertyCell(cell422, WIDTH-460, HEIGHT-200);

        Circle cell423 = new Circle();
        cell423 = propertyCell(cell423, WIDTH-480, HEIGHT-200);

        Circle cell424 = new Circle();
        cell424 = propertyCell(cell424, WIDTH-500, HEIGHT-200);

        Circle cell425 = new Circle();
        cell425 = propertyCell(cell425, WIDTH-520, HEIGHT-200);

        Circle cell426 = new Circle();
        cell426 = propertyCell(cell426, WIDTH-540, HEIGHT-200);

        Circle cell427 = new Circle();
        cell427 = propertyCell(cell427, WIDTH-560, HEIGHT-200);

        Circle cell428 = new Circle();
        cell428 = propertyCell(cell428, WIDTH-580, HEIGHT-200);

        Circle cell429 = new Circle();
        cell429 = propertyCell(cell429, WIDTH-600, HEIGHT-200);

        Circle cell430 = new Circle();
        cell430 = propertyCell(cell430, WIDTH-620, HEIGHT-200);

        Circle cell431 = new Circle();
        cell431 = propertyCell(cell431, WIDTH-640, HEIGHT-200);

        Circle cell432 = new Circle();
        cell432 = propertyCell(cell432, WIDTH-660, HEIGHT-200);

        Circle cell433 = new Circle();
        cell433 = propertyCell(cell433, WIDTH-680, HEIGHT-200);

        Circle cell434 = new Circle();
        cell434 = propertyCell(cell434, WIDTH-700, HEIGHT-200);

        Circle cell435 = new Circle();
        cell435 = propertyCell(cell435, WIDTH-720, HEIGHT-200);

        Circle cell436 = new Circle();
        cell436 = propertyCell(cell436, WIDTH-740, HEIGHT-200);

        Circle cell437 = new Circle();
        cell437 = propertyCell(cell437, WIDTH-760, HEIGHT-200);

        Circle cell438 = new Circle();
        cell438 = propertyCell(cell438, WIDTH-780, HEIGHT-200);

        Circle cell439 = new Circle();
        cell439 = propertyCell(cell439, WIDTH-800, HEIGHT-200);

        Circle cell440 = new Circle();
        cell440 = propertyCell(cell440, WIDTH-820, HEIGHT-200);

        Circle cell441 = new Circle();
        cell441 = propertyCell(cell441, WIDTH-840, HEIGHT-200);

        Circle cell442 = new Circle();
        cell442 = propertyCell(cell442, WIDTH-860, HEIGHT-200);

        Circle cell443 = new Circle();
        cell443 = propertyCell(cell443, WIDTH-880, HEIGHT-200);

        Circle cell444 = new Circle();
        cell444 = propertyCell(cell444, WIDTH-900, HEIGHT-200);

        Circle cell445 = new Circle();
        cell445 = propertyCell(cell445, WIDTH-920, HEIGHT-200);

        Circle cell446 = new Circle();
        cell446 = propertyCell(cell446, WIDTH-940, HEIGHT-200);

        Circle cell447 = new Circle();
        cell447 = propertyCell(cell447, WIDTH-960, HEIGHT-200);

        Circle cell448 = new Circle();
        cell448 = propertyCell(cell448, WIDTH-980, HEIGHT-200);

        Circle cell449 = new Circle();
        cell449 = propertyCell(cell449, WIDTH-0, HEIGHT-225);

        Circle cell450 = new Circle();
        cell450 = propertyCell(cell450, WIDTH-20, HEIGHT-225);

        Circle cell451 = new Circle();
        cell451 = propertyCell(cell451, WIDTH-40, HEIGHT-225);

        Circle cell452 = new Circle();
        cell452 = propertyCell(cell452, WIDTH-60, HEIGHT-225);

        Circle cell453 = new Circle();
        cell453 = propertyCell(cell453, WIDTH-80, HEIGHT-225);

        Circle cell454 = new Circle();
        cell454 = propertyCell(cell454, WIDTH-100, HEIGHT-225);

        Circle cell455 = new Circle();
        cell455 = propertyCell(cell455, WIDTH-120, HEIGHT-225);

        Circle cell456 = new Circle();
        cell456 = propertyCell(cell456, WIDTH-140, HEIGHT-225);

        Circle cell457 = new Circle();
        cell457 = propertyCell(cell457, WIDTH-160, HEIGHT-225);

        Circle cell458 = new Circle();
        cell458 = propertyCell(cell458, WIDTH-180, HEIGHT-225);

        Circle cell459 = new Circle();
        cell459 = propertyCell(cell459, WIDTH-200, HEIGHT-225);

        Circle cell460 = new Circle();
        cell460 = propertyCell(cell460, WIDTH-220, HEIGHT-225);

        Circle cell461 = new Circle();
        cell461 = propertyCell(cell461, WIDTH-240, HEIGHT-225);

        Circle cell462 = new Circle();
        cell462 = propertyCell(cell462, WIDTH-260, HEIGHT-225);

        Circle cell463 = new Circle();
        cell463 = propertyCell(cell463, WIDTH-280, HEIGHT-225);

        Circle cell464 = new Circle();
        cell464 = propertyCell(cell464, WIDTH-300, HEIGHT-225);

        Circle cell465 = new Circle();
        cell465 = propertyCell(cell465, WIDTH-320, HEIGHT-225);

        Circle cell466 = new Circle();
        cell466 = propertyCell(cell466, WIDTH-340, HEIGHT-225);

        Circle cell467 = new Circle();
        cell467 = propertyCell(cell467, WIDTH-360, HEIGHT-225);

        Circle cell468 = new Circle();
        cell468 = propertyCell(cell468, WIDTH-380, HEIGHT-225);

        Circle cell469 = new Circle();
        cell469 = propertyCell(cell469, WIDTH-400, HEIGHT-225);

        Circle cell470 = new Circle();
        cell470 = propertyCell(cell470, WIDTH-420, HEIGHT-225);

        Circle cell471 = new Circle();
        cell471 = propertyCell(cell471, WIDTH-440, HEIGHT-225);

        Circle cell472 = new Circle();
        cell472 = propertyCell(cell472, WIDTH-460, HEIGHT-225);

        Circle cell473 = new Circle();
        cell473 = propertyCell(cell473, WIDTH-480, HEIGHT-225);

        Circle cell474 = new Circle();
        cell474 = propertyCell(cell474, WIDTH-500, HEIGHT-225);

        Circle cell475 = new Circle();
        cell475 = propertyCell(cell475, WIDTH-520, HEIGHT-225);

        Circle cell476 = new Circle();
        cell476 = propertyCell(cell476, WIDTH-540, HEIGHT-225);

        Circle cell477 = new Circle();
        cell477 = propertyCell(cell477, WIDTH-560, HEIGHT-225);

        Circle cell478 = new Circle();
        cell478 = propertyCell(cell478, WIDTH-580, HEIGHT-225);

        Circle cell479 = new Circle();
        cell479 = propertyCell(cell479, WIDTH-600, HEIGHT-225);

        Circle cell480 = new Circle();
        cell480 = propertyCell(cell480, WIDTH-620, HEIGHT-225);

        Circle cell481 = new Circle();
        cell481 = propertyCell(cell481, WIDTH-640, HEIGHT-225);

        Circle cell482 = new Circle();
        cell482 = propertyCell(cell482, WIDTH-660, HEIGHT-225);

        Circle cell483 = new Circle();
        cell483 = propertyCell(cell483, WIDTH-680, HEIGHT-225);

        Circle cell484 = new Circle();
        cell484 = propertyCell(cell484, WIDTH-700, HEIGHT-225);

        Circle cell485 = new Circle();
        cell485 = propertyCell(cell485, WIDTH-720, HEIGHT-225);

        Circle cell486 = new Circle();
        cell486 = propertyCell(cell486, WIDTH-740, HEIGHT-225);

        Circle cell487 = new Circle();
        cell487 = propertyCell(cell487, WIDTH-760, HEIGHT-225);

        Circle cell488 = new Circle();
        cell488 = propertyCell(cell488, WIDTH-780, HEIGHT-225);

        Circle cell489 = new Circle();
        cell489 = propertyCell(cell489, WIDTH-800, HEIGHT-225);

        Circle cell490 = new Circle();
        cell490 = propertyCell(cell490, WIDTH-820, HEIGHT-225);

        Circle cell491 = new Circle();
        cell491 = propertyCell(cell491, WIDTH-840, HEIGHT-225);

        Circle cell492 = new Circle();
        cell492 = propertyCell(cell492, WIDTH-860, HEIGHT-225);

        Circle cell493 = new Circle();
        cell493 = propertyCell(cell493, WIDTH-880, HEIGHT-225);

        Circle cell494 = new Circle();
        cell494 = propertyCell(cell494, WIDTH-900, HEIGHT-225);

        Circle cell495 = new Circle();
        cell495 = propertyCell(cell495, WIDTH-920, HEIGHT-225);

        Circle cell496 = new Circle();
        cell496 = propertyCell(cell496, WIDTH-940, HEIGHT-225);

        Circle cell497 = new Circle();
        cell497 = propertyCell(cell497, WIDTH-960, HEIGHT-225);

        Circle cell498 = new Circle();
        cell498 = propertyCell(cell498, WIDTH-980, HEIGHT-225);

        Circle cell499 = new Circle();
        cell499 = propertyCell(cell499, WIDTH-1000, HEIGHT-225);
        
        Circle cell500 = new Circle();
        cell500 = propertyCell(cell500, WIDTH-1020, HEIGHT-225);

        Circle cell501 = new Circle();
        cell501 = propertyCell(cell501, WIDTH-1040, HEIGHT-225);

        Circle cell502 = new Circle();
        cell502 = propertyCell(cell502, WIDTH-1060, HEIGHT-225);

        Circle cell503 = new Circle();
        cell503 = propertyCell(cell503, WIDTH-1080, HEIGHT-225);

        Circle cell504 = new Circle();
        cell504 = propertyCell(cell504, WIDTH-1100, HEIGHT-225);

        Circle cell505 = new Circle();
        cell505 = propertyCell(cell505, WIDTH-1120, HEIGHT-225);

        Circle cell506 = new Circle();
        cell506 = propertyCell(cell506, WIDTH-1140, HEIGHT-225);

        Circle cell507 = new Circle();
        cell507 = propertyCell(cell507, WIDTH-1160, HEIGHT-225);

        Circle cell508 = new Circle();
        cell508 = propertyCell(cell508, WIDTH-1180, HEIGHT-225);

        Circle cell509 = new Circle();
        cell509 = propertyCell(cell509, WIDTH-1200, HEIGHT-225);

        Circle cell510 = new Circle();
        cell510 = propertyCell(cell510, WIDTH-1220, HEIGHT-225);

        Circle cell511 = new Circle();
        cell511 = propertyCell(cell511, WIDTH-1240, HEIGHT-225);

        Circle cell512 = new Circle();
        cell512 = propertyCell(cell512, WIDTH-1260, HEIGHT-225);

        Circle cell513 = new Circle();
        cell513 = propertyCell(cell513, WIDTH-1280, HEIGHT-225);

        Circle cell514 = new Circle();
        cell514 = propertyCell(cell514, WIDTH-1300, HEIGHT-225);

        Circle cell515 = new Circle();
        cell515 = propertyCell(cell515, WIDTH-1320, HEIGHT-225);

        Circle cell516 = new Circle();
        cell516 = propertyCell(cell516, WIDTH-1340, HEIGHT-225);

        Circle cell517 = new Circle();
        cell517 = propertyCell(cell517, WIDTH-1360, HEIGHT-225);

        Circle cell518 = new Circle();
        cell518 = propertyCell(cell518, WIDTH-1380, HEIGHT-225);

        Circle cell519 = new Circle();
        cell519 = propertyCell(cell519, WIDTH-1400, HEIGHT-225);

        Circle cell520 = new Circle();
        cell520 = propertyCell(cell520, WIDTH-1420, HEIGHT-225);

        Circle cell521 = new Circle();
        cell521 = propertyCell(cell521, WIDTH-1440, HEIGHT-225);

        Circle cell522 = new Circle();
        cell522 = propertyCell(cell522, WIDTH-1460, HEIGHT-225);

        Circle cell523 = new Circle();
        cell523 = propertyCell(cell523, WIDTH-1480, HEIGHT-225);

        Circle cell524 = new Circle();
        cell524 = propertyCell(cell524, WIDTH-1500, HEIGHT-225);

        Circle cell525 = new Circle();
        cell525 = propertyCell(cell525, WIDTH-1520, HEIGHT-225);

        Circle cell526 = new Circle();
        cell526 = propertyCell(cell526, WIDTH-1540, HEIGHT-225);

        Circle cell527 = new Circle();
        cell527 = propertyCell(cell527, WIDTH-1560, HEIGHT-225);

        Circle cell528 = new Circle();
        cell528 = propertyCell(cell528, WIDTH-1580, HEIGHT-225);

        Circle cell529 = new Circle();
        cell529 = propertyCell(cell529, WIDTH-1600, HEIGHT-225);

        Circle cell530 = new Circle();
        cell530 = propertyCell(cell530, WIDTH-1620, HEIGHT-225);

        Circle cell531 = new Circle();
        cell531 = propertyCell(cell531, WIDTH-1640, HEIGHT-225);

        Circle cell532 = new Circle();
        cell532 = propertyCell(cell532, WIDTH-1660, HEIGHT-225);

        Circle cell533 = new Circle();
        cell533 = propertyCell(cell533, WIDTH-1680, HEIGHT-225);

        Circle cell534 = new Circle();
        cell534 = propertyCell(cell534, WIDTH-1700, HEIGHT-225);

        Circle cell535 = new Circle();
        cell535 = propertyCell(cell535, WIDTH-1720, HEIGHT-225);

        Circle cell536 = new Circle();
        cell536 = propertyCell(cell536, WIDTH-1740, HEIGHT-225);

        Circle cell537 = new Circle();
        cell537 = propertyCell(cell537, WIDTH-1760, HEIGHT-225);

        Circle cell538 = new Circle();
        cell538 = propertyCell(cell538, WIDTH-1780, HEIGHT-225);

        Circle cell539 = new Circle();
        cell539 = propertyCell(cell539, WIDTH-1800, HEIGHT-225);

        Circle cell540 = new Circle();
        cell540 = propertyCell(cell540, WIDTH-1820, HEIGHT-225);

        Circle cell541 = new Circle();
        cell541 = propertyCell(cell541, WIDTH-1840, HEIGHT-225);

        Circle cell542 = new Circle();
        cell542 = propertyCell(cell542, WIDTH-1860, HEIGHT-225);

        Circle cell543 = new Circle();
        cell543 = propertyCell(cell543, WIDTH-1880, HEIGHT-225);

        Circle cell544 = new Circle();
        cell544 = propertyCell(cell544, WIDTH-1900, HEIGHT-225);

        Circle cell545 = new Circle();
        cell545 = propertyCell(cell545, WIDTH-1920, HEIGHT-225);

        Circle cell546 = new Circle();
        cell546 = propertyCell(cell546, WIDTH-1940, HEIGHT-225);

        Circle cell547 = new Circle();
        cell547 = propertyCell(cell547, WIDTH-1960, HEIGHT-225);

        Circle cell548 = new Circle();
        cell548 = propertyCell(cell548, WIDTH-1980, HEIGHT-225);

        Circle cell549 = new Circle();
        cell549 = propertyCell(cell549, WIDTH-2000, HEIGHT-225);

        Circle cell550 = new Circle();
        cell550 = propertyCell(cell550, WIDTH-2020, HEIGHT-225);

        Circle cell551 = new Circle();
        cell551 = propertyCell(cell551, WIDTH-2040, HEIGHT-225);

        Circle cell552 = new Circle();
        cell552 = propertyCell(cell552, WIDTH-2060, HEIGHT-225);

        Circle cell553 = new Circle();
        cell553 = propertyCell(cell553, WIDTH-2080, HEIGHT-225);

        Circle cell554 = new Circle();
        cell554 = propertyCell(cell554, WIDTH-2100, HEIGHT-225);

        Circle cell555 = new Circle();
        cell555 = propertyCell(cell555, WIDTH-2120, HEIGHT-225);

        Circle cell556 = new Circle();
        cell556 = propertyCell(cell556, WIDTH-2140, HEIGHT-225);

        Circle cell557 = new Circle();
        cell557 = propertyCell(cell557, WIDTH-2160, HEIGHT-225);

        Circle cell558 = new Circle();
        cell558 = propertyCell(cell558, WIDTH-2180, HEIGHT-225);

        Circle cell559 = new Circle();
        cell559 = propertyCell(cell559, WIDTH-2200, HEIGHT-225);

        Circle cell560 = new Circle();
        cell560 = propertyCell(cell560, WIDTH-2220, HEIGHT-225);

        Circle cell561 = new Circle();
        cell561 = propertyCell(cell561, WIDTH-2240, HEIGHT-225);

        Circle cell562 = new Circle();
        cell562 = propertyCell(cell562, WIDTH-2260, HEIGHT-225);

        Circle cell563 = new Circle();
        cell563 = propertyCell(cell563, WIDTH-2280, HEIGHT-225);

        Circle cell564 = new Circle();
        cell564 = propertyCell(cell564, WIDTH-2300, HEIGHT-225);

        Circle cell565 = new Circle();
        cell565 = propertyCell(cell565, WIDTH-2320, HEIGHT-225);

        Circle cell566 = new Circle();
        cell566 = propertyCell(cell566, WIDTH-2340, HEIGHT-225);

        Circle cell567 = new Circle();
        cell567 = propertyCell(cell567, WIDTH-2360, HEIGHT-225);

        Circle cell568 = new Circle();
        cell568 = propertyCell(cell568, WIDTH-2380, HEIGHT-225);

        Circle cell569 = new Circle();
        cell569 = propertyCell(cell569, WIDTH-2400, HEIGHT-225);

        Circle cell570 = new Circle();
        cell570 = propertyCell(cell570, WIDTH-2420, HEIGHT-225);

        Circle cell571 = new Circle();
        cell571 = propertyCell(cell571, WIDTH-2440, HEIGHT-225);

        Circle cell572 = new Circle();
        cell572 = propertyCell(cell572, WIDTH-2460, HEIGHT-225);

        Circle cell573 = new Circle();
        cell573 = propertyCell(cell573, WIDTH-2480, HEIGHT-225);

        Circle cell574 = new Circle();
        cell574 = propertyCell(cell574, WIDTH-2500, HEIGHT-225);

        Circle cell575 = new Circle();
        cell575 = propertyCell(cell575, WIDTH-2520, HEIGHT-225);

        Circle cell576 = new Circle();
        cell576 = propertyCell(cell576, WIDTH-2540, HEIGHT-225);

        Circle cell577 = new Circle();
        cell577 = propertyCell(cell577, WIDTH-2560, HEIGHT-225);

        Circle cell578 = new Circle();
        cell578 = propertyCell(cell578, WIDTH-2580, HEIGHT-225);

        Circle cell579 = new Circle();
        cell579 = propertyCell(cell579, WIDTH-2600, HEIGHT-225);

        Circle cell580 = new Circle();
        cell580 = propertyCell(cell580, WIDTH-2620, HEIGHT-225);

        Circle cell581 = new Circle();
        cell581 = propertyCell(cell581, WIDTH-2640, HEIGHT-225);

        Circle cell582 = new Circle();
        cell582 = propertyCell(cell582, WIDTH-2660, HEIGHT-225);

        Circle cell583 = new Circle();
        cell583 = propertyCell(cell583, WIDTH-2680, HEIGHT-225);

        Circle cell584 = new Circle();
        cell584 = propertyCell(cell584, WIDTH-2700, HEIGHT-225);

        Circle cell585 = new Circle();
        cell585 = propertyCell(cell585, WIDTH-2720, HEIGHT-225);

        Circle cell586 = new Circle();
        cell586 = propertyCell(cell586, WIDTH-2740, HEIGHT-225);

        Circle cell587 = new Circle();
        cell587 = propertyCell(cell587, WIDTH-2760, HEIGHT-225);

        Circle cell588 = new Circle();
        cell588 = propertyCell(cell588, WIDTH-2780, HEIGHT-225);

        Circle cell589 = new Circle();
        cell589 = propertyCell(cell589, WIDTH-2800, HEIGHT-225);

        Circle cell590 = new Circle();
        cell590 = propertyCell(cell590, WIDTH-2820, HEIGHT-225);

        Circle cell591 = new Circle();
        cell591 = propertyCell(cell591, WIDTH-2840, HEIGHT-225);

        Circle cell592 = new Circle();
        cell592 = propertyCell(cell592, WIDTH-2860, HEIGHT-225);

        Circle cell593 = new Circle();
        cell593 = propertyCell(cell593, WIDTH-2880, HEIGHT-225);

        Circle cell594 = new Circle();
        cell594 = propertyCell(cell594, WIDTH-2900, HEIGHT-225);

        Circle cell595 = new Circle();
        cell595 = propertyCell(cell595, WIDTH-2920, HEIGHT-225);

        Circle cell596 = new Circle();
        cell596 = propertyCell(cell596, WIDTH-2940, HEIGHT-225);

        Circle cell597 = new Circle();
        cell597 = propertyCell(cell597, WIDTH-2960, HEIGHT-225);

        Circle cell598 = new Circle();
        cell598 = propertyCell(cell598, WIDTH-2980, HEIGHT-225);

        Circle cell599 = new Circle();
        cell599 = propertyCell(cell599, WIDTH-0, HEIGHT-250);

        Circle cell600 = new Circle();
        cell600 = propertyCell(cell600, WIDTH-20, HEIGHT-250);

        Circle cell601 = new Circle();
        cell601 = propertyCell(cell601, WIDTH-40, HEIGHT-250);

        Circle cell602 = new Circle();
        cell602 = propertyCell(cell602, WIDTH-60, HEIGHT-250);

        Circle cell603 = new Circle();
        cell603 = propertyCell(cell603, WIDTH-80, HEIGHT-250);

        Circle cell604 = new Circle();
        cell604 = propertyCell(cell604, WIDTH-100, HEIGHT-250);

        Circle cell605 = new Circle();
        cell605 = propertyCell(cell605, WIDTH-120, HEIGHT-250);

        Circle cell606 = new Circle();
        cell606 = propertyCell(cell606, WIDTH-140, HEIGHT-250);

        Circle cell607 = new Circle();
        cell607 = propertyCell(cell607, WIDTH-160, HEIGHT-250);

        Circle cell608 = new Circle();
        cell608 = propertyCell(cell608, WIDTH-180, HEIGHT-250);

        Circle cell609 = new Circle();
        cell609 = propertyCell(cell609, WIDTH-200, HEIGHT-250);

        Circle cell610 = new Circle();
        cell610 = propertyCell(cell610, WIDTH-220, HEIGHT-250);

        Circle cell611 = new Circle();
        cell611 = propertyCell(cell611, WIDTH-240, HEIGHT-250);

        Circle cell612 = new Circle();
        cell612 = propertyCell(cell612, WIDTH-260, HEIGHT-250);

        Circle cell613 = new Circle();
        cell613 = propertyCell(cell613, WIDTH-280, HEIGHT-250);

        Circle cell614 = new Circle();
        cell614 = propertyCell(cell614, WIDTH-300, HEIGHT-250);

        Circle cell615 = new Circle();
        cell615 = propertyCell(cell615, WIDTH-320, HEIGHT-250);

        Circle cell616 = new Circle();
        cell616 = propertyCell(cell616, WIDTH-340, HEIGHT-250);

        Circle cell617 = new Circle();
        cell617 = propertyCell(cell617, WIDTH-360, HEIGHT-250);

        Circle cell618 = new Circle();
        cell618 = propertyCell(cell618, WIDTH-380, HEIGHT-250);

        Circle cell619 = new Circle();
        cell619 = propertyCell(cell619, WIDTH-400, HEIGHT-250);

        Circle cell620 = new Circle();
        cell620 = propertyCell(cell620, WIDTH-420, HEIGHT-250);

        Circle cell621 = new Circle();
        cell621 = propertyCell(cell621, WIDTH-440, HEIGHT-250);

        Circle cell622 = new Circle();
        cell622 = propertyCell(cell622, WIDTH-460, HEIGHT-250);

        Circle cell623 = new Circle();
        cell623 = propertyCell(cell623, WIDTH-480, HEIGHT-250);

        Circle cell624 = new Circle();
        cell624 = propertyCell(cell624, WIDTH-500, HEIGHT-250);

        Circle cell625 = new Circle();
        cell625 = propertyCell(cell625, WIDTH-520, HEIGHT-250);

        Circle cell626 = new Circle();
        cell626 = propertyCell(cell626, WIDTH-540, HEIGHT-250);

        Circle cell627 = new Circle();
        cell627 = propertyCell(cell627, WIDTH-560, HEIGHT-250);

        Circle cell628 = new Circle();
        cell628 = propertyCell(cell628, WIDTH-580, HEIGHT-250);

        Circle cell629 = new Circle();
        cell629 = propertyCell(cell629, WIDTH-600, HEIGHT-250);

        Circle cell630 = new Circle();
        cell630 = propertyCell(cell630, WIDTH-620, HEIGHT-250);

        Circle cell631 = new Circle();
        cell631 = propertyCell(cell631, WIDTH-640, HEIGHT-250);

        Circle cell632 = new Circle();
        cell632 = propertyCell(cell632, WIDTH-660, HEIGHT-250);

        Circle cell633 = new Circle();
        cell633 = propertyCell(cell633, WIDTH-680, HEIGHT-250);

        Circle cell634 = new Circle();
        cell634 = propertyCell(cell634, WIDTH-700, HEIGHT-250);

        Circle cell635 = new Circle();
        cell635 = propertyCell(cell635, WIDTH-720, HEIGHT-250);

        Circle cell636 = new Circle();
        cell636 = propertyCell(cell636, WIDTH-740, HEIGHT-250);

        Circle cell637 = new Circle();
        cell637 = propertyCell(cell637, WIDTH-760, HEIGHT-250);

        Circle cell638 = new Circle();
        cell638 = propertyCell(cell638, WIDTH-780, HEIGHT-250);

        Circle cell639 = new Circle();
        cell639 = propertyCell(cell639, WIDTH-800, HEIGHT-250);

        Circle cell640 = new Circle();
        cell640 = propertyCell(cell640, WIDTH-820, HEIGHT-250);

        Circle cell641 = new Circle();
        cell641 = propertyCell(cell641, WIDTH-840, HEIGHT-250);

        Circle cell642 = new Circle();
        cell642 = propertyCell(cell642, WIDTH-860, HEIGHT-250);

        Circle cell643 = new Circle();
        cell643 = propertyCell(cell643, WIDTH-880, HEIGHT-250);

        Circle cell644 = new Circle();
        cell644 = propertyCell(cell644, WIDTH-900, HEIGHT-250);

        Circle cell645 = new Circle();
        cell645 = propertyCell(cell645, WIDTH-920, HEIGHT-250);

        Circle cell646 = new Circle();
        cell646 = propertyCell(cell646, WIDTH-940, HEIGHT-250);

        Circle cell647 = new Circle();
        cell647 = propertyCell(cell647, WIDTH-960, HEIGHT-250);

        Circle cell648 = new Circle();
        cell648 = propertyCell(cell648, WIDTH-980, HEIGHT-250);

        Circle cell649 = new Circle();
        cell649 = propertyCell(cell649, WIDTH-0, HEIGHT-275);

        Circle cell650 = new Circle();
        cell650 = propertyCell(cell650, WIDTH-20, HEIGHT-275);

        Circle cell651 = new Circle();
        cell651 = propertyCell(cell651, WIDTH-40, HEIGHT-275);

        Circle cell652 = new Circle();
        cell652 = propertyCell(cell652, WIDTH-60, HEIGHT-275);

        Circle cell653 = new Circle();
        cell653 = propertyCell(cell653, WIDTH-80, HEIGHT-275);

        Circle cell654 = new Circle();
        cell654 = propertyCell(cell654, WIDTH-100, HEIGHT-275);

        Circle cell655 = new Circle();
        cell655 = propertyCell(cell655, WIDTH-120, HEIGHT-275);

        Circle cell656 = new Circle();
        cell656 = propertyCell(cell656, WIDTH-140, HEIGHT-275);

        Circle cell657 = new Circle();
        cell657 = propertyCell(cell657, WIDTH-160, HEIGHT-275);

        Circle cell658 = new Circle();
        cell658 = propertyCell(cell658, WIDTH-180, HEIGHT-275);

        Circle cell659 = new Circle();
        cell659 = propertyCell(cell659, WIDTH-200, HEIGHT-275);

        Circle cell660 = new Circle();
        cell660 = propertyCell(cell660, WIDTH-220, HEIGHT-275);

        Circle cell661 = new Circle();
        cell661 = propertyCell(cell661, WIDTH-240, HEIGHT-275);

        Circle cell662 = new Circle();
        cell662 = propertyCell(cell662, WIDTH-260, HEIGHT-275);

        Circle cell663 = new Circle();
        cell663 = propertyCell(cell663, WIDTH-280, HEIGHT-275);

        Circle cell664 = new Circle();
        cell664 = propertyCell(cell664, WIDTH-300, HEIGHT-275);

        Circle cell665 = new Circle();
        cell665 = propertyCell(cell665, WIDTH-320, HEIGHT-275);

        Circle cell666 = new Circle();
        cell666 = propertyCell(cell666, WIDTH-340, HEIGHT-275);

        Circle cell667 = new Circle();
        cell667 = propertyCell(cell667, WIDTH-360, HEIGHT-275);

        Circle cell668 = new Circle();
        cell668 = propertyCell(cell668, WIDTH-380, HEIGHT-275);

        Circle cell669 = new Circle();
        cell669 = propertyCell(cell669, WIDTH-400, HEIGHT-275);

        Circle cell670 = new Circle();
        cell670 = propertyCell(cell670, WIDTH-420, HEIGHT-275);

        Circle cell671 = new Circle();
        cell671 = propertyCell(cell671, WIDTH-440, HEIGHT-275);

        Circle cell672 = new Circle();
        cell672 = propertyCell(cell672, WIDTH-460, HEIGHT-275);

        Circle cell673 = new Circle();
        cell673 = propertyCell(cell673, WIDTH-480, HEIGHT-275);

        Circle cell674 = new Circle();
        cell674 = propertyCell(cell674, WIDTH-500, HEIGHT-275);

        Circle cell675 = new Circle();
        cell675 = propertyCell(cell675, WIDTH-520, HEIGHT-275);

        Circle cell676 = new Circle();
        cell676 = propertyCell(cell676, WIDTH-540, HEIGHT-275);

        Circle cell677 = new Circle();
        cell677 = propertyCell(cell677, WIDTH-560, HEIGHT-275);

        Circle cell678 = new Circle();
        cell678 = propertyCell(cell678, WIDTH-580, HEIGHT-275);

        Circle cell679 = new Circle();
        cell679 = propertyCell(cell679, WIDTH-600, HEIGHT-275);

        Circle cell680 = new Circle();
        cell680 = propertyCell(cell680, WIDTH-620, HEIGHT-275);

        Circle cell681 = new Circle();
        cell681 = propertyCell(cell681, WIDTH-640, HEIGHT-275);

        Circle cell682 = new Circle();
        cell682 = propertyCell(cell682, WIDTH-660, HEIGHT-275);

        Circle cell683 = new Circle();
        cell683 = propertyCell(cell683, WIDTH-680, HEIGHT-275);

        Circle cell684 = new Circle();
        cell684 = propertyCell(cell684, WIDTH-700, HEIGHT-275);

        Circle cell685 = new Circle();
        cell685 = propertyCell(cell685, WIDTH-720, HEIGHT-275);

        Circle cell686 = new Circle();
        cell686 = propertyCell(cell686, WIDTH-740, HEIGHT-275);

        Circle cell687 = new Circle();
        cell687 = propertyCell(cell687, WIDTH-760, HEIGHT-275);

        Circle cell688 = new Circle();
        cell688 = propertyCell(cell688, WIDTH-780, HEIGHT-275);

        Circle cell689 = new Circle();
        cell689 = propertyCell(cell689, WIDTH-800, HEIGHT-275);

        Circle cell690 = new Circle();
        cell690 = propertyCell(cell690, WIDTH-820, HEIGHT-275);

        Circle cell691 = new Circle();
        cell691 = propertyCell(cell691, WIDTH-840, HEIGHT-275);

        Circle cell692 = new Circle();
        cell692 = propertyCell(cell692, WIDTH-860, HEIGHT-275);

        Circle cell693 = new Circle();
        cell693 = propertyCell(cell693, WIDTH-880, HEIGHT-275);

        Circle cell694 = new Circle();
        cell694 = propertyCell(cell694, WIDTH-900, HEIGHT-275);

        Circle cell695 = new Circle();
        cell695 = propertyCell(cell695, WIDTH-920, HEIGHT-275);

        Circle cell696 = new Circle();
        cell696 = propertyCell(cell696, WIDTH-940, HEIGHT-275);

        Circle cell697 = new Circle();
        cell697 = propertyCell(cell697, WIDTH-960, HEIGHT-275);

        Circle cell698 = new Circle();
        cell698 = propertyCell(cell698, WIDTH-980, HEIGHT-275);


		Circle[] cells_bottom = {cell0, cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8, cell9, cell10, cell11, cell12, cell13, cell14, cell15, cell16, cell17, cell18, cell19, cell20, cell21, cell22, cell23, cell24, cell25, cell26, cell27, cell28, cell29, cell30, cell31, cell32, cell33, cell34, cell35, cell36, cell37, cell38, cell39, cell40, cell41, cell42, cell43, cell44, cell45, cell46, cell47, cell48, cell49, cell50, cell51, cell52, cell53, cell54, cell55, cell56, cell57, cell58, cell59, cell60, cell61, cell62, cell63, cell64, cell65, cell66, cell67, cell68, cell69, cell70, cell71, cell72, cell73, cell74, cell75, cell76, cell77, cell78, cell79, cell80, cell81, cell82, cell83, cell84, cell85, cell86, cell87, cell88, cell89, cell90, cell91, cell92, cell93, cell94, cell95, cell96, cell97, cell98, cell99, cell100, cell101, cell102, cell103, cell104, cell105, cell106, cell107, cell108, cell109, cell110, cell111, cell112, cell113, cell114, cell115, cell116, cell117, cell118, cell119, cell120, cell121, cell122, cell123, cell124, cell125, cell126, cell127, cell128, cell129, cell130, cell131, cell132, cell133, cell134, cell135, cell136, cell137, cell138, cell139, cell140, cell141, cell142, cell143, cell144, cell145, cell146, cell147, cell148, cell149, cell150, cell151, cell152, cell153, cell154, cell155, cell156, cell157, cell158, cell159, cell160, cell161, cell162, cell163, cell164, cell165, cell166, cell167, cell168, cell169, cell170, cell171, cell172, cell173, cell174, cell175, cell176, cell177, cell178, cell179, cell180, cell181, cell182, cell183, cell184, cell185, cell186, cell187, cell188, cell189, cell190, cell191, cell192, cell193, cell194, cell195, cell196, cell197, cell198, cell199, cell200, cell201, cell202, cell203, cell204, cell205, cell206, cell207, cell208, cell209, cell210, cell211, cell212, cell213, cell214, cell215, cell216, cell217, cell218, cell219, cell220, cell221, cell222, cell223, cell224, cell225, cell226, cell227, cell228, cell229, cell230, cell231, cell232, cell233, cell234, cell235, cell236, cell237, cell238, cell239, cell240, cell241, cell242, cell243, cell244, cell245, cell246, cell247, cell248, cell249, cell250, cell251, cell252, cell253, cell254, cell255, cell256, cell257, cell258, cell259, cell260, cell261, cell262, cell263, cell264, cell265, cell266, cell267, cell268, cell269, cell270, cell271, cell272, cell273, cell274, cell275, cell276, cell277, cell278, cell279, cell280, cell281, cell282, cell283, cell284, cell285, cell286, cell287, cell288, cell289, cell290, cell291, cell292, cell293, cell294, cell295, cell296, cell297, cell298, cell299, cell300, cell301, cell302, cell303, cell304, cell305, cell306, cell307, cell308, cell309, cell310, cell311, cell312, cell313, cell314, cell315, cell316, cell317, cell318, cell319, cell320, cell321, cell322, cell323, cell324, cell325, cell326, cell327, cell328, cell329, cell330, cell331, cell332, cell333, cell334, cell335, cell336, cell337, cell338, cell339, cell340, cell341, cell342, cell343, cell344, cell345, cell346, cell347, cell348, cell349, cell350, cell351, cell352, cell353, cell354, cell355, cell356, cell357, cell358, cell359, cell360, cell361, cell362, cell363, cell364, cell365, cell366, cell367, cell368, cell369, cell370, cell371, cell372, cell373, cell374, cell375, cell376, cell377, cell378, cell379, cell380, cell381, cell382, cell383, cell384, cell385, cell386, cell387, cell388, cell389, cell390, cell391, cell392, cell393, cell394, cell395, cell396, cell397, cell398, cell399, cell400, cell401, cell402, cell403, cell404, cell405, cell406, cell407, cell408, cell409, cell410, cell411, cell412, cell413, cell414, cell415, cell416, cell417, cell418, cell419, cell420, cell421, cell422, cell423, cell424, cell425, cell426, cell427, cell428, cell429, cell430, cell431, cell432, cell433, cell434, cell435, cell436, cell437, cell438, cell439, cell440, cell441, cell442, cell443, cell444, cell445, cell446, cell447, cell448, cell449, cell450, cell451, cell452, cell453, cell454, cell455, cell456, cell457, cell458, cell459, cell460, cell461, cell462, cell463, cell464, cell465, cell466, cell467, cell468, cell469, cell470, cell471, cell472, cell473, cell474, cell475, cell476, cell477, cell478, cell479, cell480, cell481, cell482, cell483, cell484, cell485, cell486, cell487, cell488, cell489, cell490, cell491, cell492, cell493, cell494, cell495, cell496, cell497, cell498, cell499, cell500, cell501, cell502, cell503, cell504, cell505, cell506, cell507, cell508, cell509, cell510, cell511, cell512, cell513, cell514, cell515, cell516, cell517, cell518, cell519, cell520, cell521, cell522, cell523, cell524, cell525, cell526, cell527, cell528, cell529, cell530, cell531, cell532, cell533, cell534, cell535, cell536, cell537, cell538, cell539, cell540, cell541, cell542, cell543, cell544, cell545, cell546, cell547, cell548, cell549, cell550, cell551, cell552, cell553, cell554, cell555, cell556, cell557, cell558, cell559, cell560, cell561, cell562, cell563, cell564, cell565, cell566, cell567, cell568, cell569, cell570, cell571, cell572, cell573, cell574, cell575, cell576, cell577, cell578, cell579, cell580, cell581, cell582, cell583, cell584, cell585, cell586, cell587, cell588, cell589, cell590, cell591, cell592, cell593, cell594, cell595, cell596, cell597, cell598, cell599, cell600, cell601, cell602, cell603, cell604, cell605, cell606, cell607, cell608, cell609, cell610, cell611, cell612, cell613, cell614, cell615, cell616, cell617, cell618, cell619, cell620, cell621, cell622, cell623, cell624, cell625, cell626, cell627, cell628, cell629, cell630, cell631, cell632, cell633, cell634, cell635, cell636, cell637, cell638, cell639, cell640, cell641, cell642, cell643, cell644, cell645, cell646, cell647, cell648, cell649, cell650, cell651, cell652, cell653, cell654, cell655, cell656, cell657, cell658, cell659, cell660, cell661, cell662, cell663, cell664, cell665, cell666, cell667, cell668, cell669, cell670, cell671, cell672, cell673, cell674, cell675, cell676, cell677, cell678, cell679, cell680, cell681, cell682, cell683, cell684, cell685, cell686, cell687, cell688, cell689, cell690, cell691, cell692, cell693, cell694, cell695, cell696, cell697, cell698};
		return cells_bottom;
	}

	public Circle[] init_top_cells() {
		
		Circle[] cells_top = {};
		return cells_top;
	}
}
