package com.kh.farmapp.activity.model.dao;

import java.util.List;
import java.util.Map;

import common.dto.Application;
import common.dto.FarmActivity;
import common.dto.FarmActivityFile;
import common.util.Paging;

public interface ActivityDao {

	/**전체 활동 리스트 조회
	 * 
	 * @param map - 페이징 객체, 활동 구분을 담은 Map
	 * @return List<FarmActivity> - 체험활동/일손돕기 전체 리스트 
	 */
	public List<FarmActivity> selectActivityList(Map<String, Object> map);
	
	
	/**전체 활동 파일 리스트 조회
	 * 
	 * @return List<FarmActivityFile> - 활동 파일 전체 리스트 
	 */
	public List<FarmActivityFile> selectActivityFileList();
	
	
	/**활동 상세 정보 조회
	 * 
	 * @param activityNo - 조회할 활동 번호
	 * @return FarmActivity - 조회한 활동 정보를 담은 객체
	 */
	public FarmActivity selectActivityDetail(int activityNo);
	
	
	/**활동 파일 정보 조회
	 * 
	 * @param activityNo - 조회할 파일의 활동 번호
	 * @return List<Map<String, String>> - 조회한 파일 정보를 담은 객체
	 */
	public List<Map<String, String>> selectFileWithActivity(int activityNo);
	
	
	/**활동명으로 활동 검색
	 * 
	 * @param map - 활동 구분, 검색어(활동명)를 담은 매개변수
	 * @return FarmActivity - 검색 결과(활동) 정보 반환
	 */
	public FarmActivity selectActivityByTitle(Map<String, String> map);
	
	
	/**활동명으로 활동 파일 검색
	 * 
	 * @param map - 체험 구분, 검색어(활동명)를 담은 매개변수 map
	 * @return List<Map<String, String>> - 검색 결과(활동 파일) 정보 반환
	 */
	public List<Map<String, String>> selectFileWithActivityTitle(Map<String, String> map);
	
	
	/**입력한 신청서 저장
	 * 
	 * @param application - 사용자가 입력한 신청 정보
	 * @return int - 저장 결과
	 */
	public int insertApplication(Application application);
	
	
	
}
