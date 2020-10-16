<template>
  <div class="p-0">
    <div
      class="container-fluid p-0"
      style="box-shadow: 0px 15px 10px -15px #111"
    >
      <div id="breadcrumb" class="sub-navbar breadcrumb mb-0">
        <div class="col-md-6">
          <h5>Alerts</h5>
          <span class="text-primary">Events flagged by rules, ML</span>
        </div>
      </div>
    </div>
    <div class="timeline-container mt-5">
      <div class="row mx position-relative row-mb width97">
        <button class="btn btn-primary position-absolute px-3 py-2 filter-btn">
          <i class="fa fa-filter mr-3" aria-hidden="true"></i>Filter
        </button>
        <div class="w-full px-3 py-2 bg-4 main-secondary-color">
          <div class="row">
            <div
              class="col-lg-6 d-flex justify-content-start align-items-center py-2"
            >
              <span class="grey-text">Activity on Wednesday, 31st</span>
            </div>
          </div>
        </div>
        <div class="w-full p-3 bg-5">
          <div class="row">
            <div class="col text-center p-3 right-separator">
              <h6 class="text-muted">Events</h6>
              <h2>50</h2>
            </div>
            <div class="col text-center p-3 right-separator">
              <h6 class="text-muted">Users</h6>
              <h2>5</h2>
            </div>
            <div class="col text-center p-3 right-separator">
              <h6 class="text-muted">Zones</h6>
              <h2>3</h2>
            </div>
            <div class="col text-center p-3 right-separator">
              <h6 class="text-muted">Alerts</h6>
              <h2 class="text-danger">30</h2>
            </div>
            <div class="col text-center p-3 right-separator">
              <h6 class="text-muted">ML Alerts</h6>
              <h2 class="text-danger">13</h2>
            </div>
            <div class="col text-center p-3">
              <h6 class="text-muted">Anomalies</h6>
              <h2 class="text-danger">2</h2>
            </div>
          </div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">12:19 am</span>
        </div>
        <div class="col-lg-6">
          <router-link :to="{ name: 'alert_detail' }" exact>
            <div class="timeline-bar danger d-flex align-items-center p-3 bg-5">
              <span class="info-icon text-muted text-center mr-3"
                ><i
                  class="fa fa-user"
                  aria-hidden="true"
                  style="line-height: 1.6"
                ></i
              ></span>
              <span class="info-text">Multiple logins from unknown zones</span>
            </div>
          </router-link>
        </div>
        <div class="col-lg-6">
          <div
            class="timeline-bar blank d-flex align-items-center bg-3 px-3"
          ></div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">12:20 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar warning d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-user"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">3x Application login</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar position-relative bg-5 p-3">
            <div class="info">Anomalous Behavior</div>
            <div
              class="count position-absolute d-flex align-items-center justify-content-center"
            >
              <span>+1</span>
            </div>
          </div>
          <!-- <div class="timeline-bar position-relative bg-5 p-3">
          <div class="info">xzxz</div>
          <div class="count position-absolute d-flex align-items-center justify-content-center"><span>+25</span></div>
        </div> -->
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">12:23 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar info d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-user"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">Remote access by user ghardin</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div
            class="timeline-bar blank d-flex align-items-center bg-3 px-3"
          ></div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">12:24 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar info d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-user"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">Login to application twitter</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div
            class="timeline-bar blank d-flex align-items-center bg-3 px-3"
          ></div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">12:25 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar info d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-user"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">Remote access by user jdonaldson</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div
            class="timeline-bar blank d-flex align-items-center bg-3 px-3"
          ></div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">1:00 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar info d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-bell"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">2x Security Alert</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div
            class="timeline-bar blank d-flex align-items-center bg-3 px-3"
          ></div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">1:00 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar info d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-bell"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">Symantec Alert alert| Dridex</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar position-relative bg-5 p-3">
            <div class="info">Third distinct security alert on asset</div>
            <div
              class="count position-absolute d-flex align-items-center justify-content-center"
            >
              <span>+25</span>
            </div>
          </div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">4:10 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar danger d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-user"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">7x Failed Login</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div
            class="timeline-bar blank d-flex align-items-center bg-3 px-3"
          ></div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">4:17 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar info d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-user"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">Failed logon by user derickson</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar position-relative bg-5 p-3">
            <div class="info">10 users failed to login to the host</div>
            <div
              class="count position-absolute d-flex align-items-center justify-content-center"
            >
              <span>+10</span>
            </div>
          </div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">4:19 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar info d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-desktop"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">DNS query:www.krbsectyxfpxsofe.ru</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar position-relative bg-5 p-3">
            <div class="info">DNS query for DGA domain from a host</div>
            <div
              class="count position-absolute d-flex align-items-center justify-content-center"
            >
              <span>+10</span>
            </div>
          </div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">4:19 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar info d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-desktop"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">DNS response: www.krbsectyxfpxsofe.ru</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div
            class="timeline-bar blank d-flex align-items-center bg-3 px-3"
          ></div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">4:19 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar info d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-user"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text"
              >Failed network connection from 10.40.245.197 to
              10.40.55.111</span
            >
          </div>
        </div>
        <div class="col-lg-6">
          <div
            class="timeline-bar blank d-flex align-items-center bg-3 px-3"
          ></div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">4:20 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar warning d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-desktop"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">Web access to www.krbsectyxfpxsofe.ru</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div
            class="timeline-bar blank d-flex align-items-center bg-3 px-3"
          ></div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">4:20 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar info d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-user"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text">3x Network Connection failed</span>
          </div>
        </div>
        <div class="col-lg-6">
          <div
            class="timeline-bar blank d-flex align-items-center bg-3 px-3"
          ></div>
        </div>
      </div>
      <div class="row mx position-relative row-mb">
        <div class="position-absolute timestamp">
          <span class="text-muted">4:22 am</span>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar info d-flex align-items-center p-3 bg-5">
            <span class="info-icon text-muted text-center mr-3"
              ><i
                class="fa fa-user"
                aria-hidden="true"
                style="line-height: 1.6"
              ></i
            ></span>
            <span class="info-text"
              >Failed network connection from 10.40.245.197 to
              10.40.55.155</span
            >
          </div>
        </div>
        <div class="col-lg-6">
          <div class="timeline-bar position-relative bg-5 p-3">
            <div class="info">
              Abnormal port 22 uset used in outbound network connection from
              asset
            </div>
            <div
              class="count position-absolute d-flex align-items-center justify-content-center"
            >
              <span>+1</span>
            </div>
          </div>
        </div>
      </div>
      <div class="scrl-btn position-fixed">
        <button class="btn bg-5 d-block">
          <i class="fa fa-caret-up" aria-hidden="true"></i>
        </button>
        <button class="btn bg-5 d-block">
          <i class="fa fa-caret-down" aria-hidden="true"></i>
        </button>
      </div>
    </div>
    <div class="d-flex w-full justify-content-center p-4">
      <button class="btn btn-primary px-3 py-2 filter-btn">Load More</button>
    </div>
  </div>
</template>
<script>
export default {
  data () {
    return {
      alerts: [
        {
          name: 'Login failed',
          event:
            'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas viverra augue id dui tristique, ut luctus massa cursus. Etiam mi eros, consequat ac aliquet mattis, consectetur nec orci.',
          time: '30 minutes ago',
          severity: 5,
          status: 'anlyzed'
        },
        {
          name: 'Malware',
          event:
            'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas viverra augue id dui tristique, ut luctus massa cursus. Etiam mi eros, consequat ac aliquet mattis, consectetur nec orci.',
          time: '1 hour ago',
          severity: 2,
          status: 'anlyzed'
        },
        {
          name: 'Spyware',
          event:
            'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas viverra augue id dui tristique, ut luctus massa cursus. Etiam mi eros, consequat ac aliquet mattis, consectetur nec orci.',
          time: '2 hours ago',
          severity: 2,
          status: 'anlyzed'
        },
        {
          name: 'Trojan',
          event:
            'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas viverra augue id dui tristique, ut luctus massa cursus. Etiam mi eros, consequat ac aliquet mattis, consectetur nec orci.',
          time: '2 hours ago',
          severity: 5,
          status: 'anlyzed'
        },
        {
          name: 'Some event',
          event:
            'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas viverra augue id dui tristique, ut luctus massa cursus. Etiam mi eros, consequat ac aliquet mattis, consectetur nec orci.',
          time: '3 minutes ago',
          status: 'failed'
        },
        {
          name: 'Authentication failure',
          event:
            'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas viverra augue id dui tristique, ut luctus massa cursus. Etiam mi eros, consequat ac aliquet mattis, consectetur nec orci.',
          time: '30 minutes ago',
          status: 'anlyzing'
        },
        {
          name: 'Authentication failure',
          event:
            'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas viverra augue id dui tristique, ut luctus massa cursus. Etiam mi eros, consequat ac aliquet mattis, consectetur nec orci.',
          time: '30 minutes ago',
          status: 'anlyzing'
        }
      ]
    }
  },
  methods: {
    alertSelect (alert) {
      console.log(alert)
    }
  }
}
</script>
<style scoped>
.info-text {
  color: #fff !important;
}
.timeline-container a:hover {
  text-decoration: None !important;
}
.timeline-container {
  position: relative;
  padding-left: 200px;
  padding-right: 100px;
}
.container-fluid {
  border-radius: 0px !important;
}
.timeline-container::before {
  content: "";
  position: absolute;
  display: block;
  width: 4px;
  height: calc(100% + 14px);
  left: 175px;
  top: -14px;
}
.timeline-container::before {
  /* background-color: #2F304D !important; */
  background-color: #fff;
  opacity: 0.1;
}
.timeline-container .filter-btn {
  left: -173px;
}
.bg-4 {
  background-color: #262833;
}
.bg-5 {
  background: #22232e;
}
.timestamp {
  left: -90px;
  top: 50%;
  transform: translateY(-50%);
}
.timestamp::before {
  background-color: #22232e;
  /* opacity: 0.3; */
}
.timestamp::before {
  content: "";
  display: block;
  position: absolute;
  width: 14px;
  height: 14px;
  right: -24px;
  top: 50%;
  border-radius: 25px;
  transform: translateY(-50%);
}
h2 {
  font-size: 24px;
  font-weight: 500;
  color: #ffffff;
  opacity: 0.3;
}
.text-danger {
  opacity: 1;
}

a {
  color: #007bff;
  text-decoration: none;
  background-color: transparent;
}
.timeline-bar.danger {
  border-left: 5px solid #ef5350;
}
.timeline-bar {
  height: 100%;
  min-height: 50px;
  word-wrap: break-word;
  display: flex !important;
  align-items: center !important;
}
.bg-3 {
  background-color: #262833;
  background-color: rgba(38, 40, 51, 0.2);
}
.timeline-bar.warning {
  border-left: 5px solid #ffc107;
}
.timeline-bar .count {
  background-color: #17c0fc;
}
.timeline-bar .count {
  height: 100%;
  width: 50px;
  right: 0;
  top: 0;
  color: #ffffff;
}
.timeline-bar.info {
  border-left: 5px solid #007bff;
}
.w-full {
  width: 100%;
}
.btn-primary {
  background-color: #17c0fc;
  border: 1px solid #17c0fc;
}
.grey-text {
  color: #ffffff;
  opacity: 0.3;
}
.main-secondary-color {
  background-color: #262833;
}
.row-mb {
  margin-bottom: 10px;
}
.row.mx {
  margin-right: -10px;
  margin-left: -10px;
}
.row.mx.width97 {
  width: 99%;
  margin: 0 auto;
  margin-bottom: 10px;
}
.info-text,
.text-primary {
  color: #fff !important;
  opacity: 0.3;
}
.timeline-bar div.info,
h5 {
  color: #fff !important;
  opacity: 0.3;
}
.btn-prime {
  background: #17c0fc;
}
.breadcrumb {
  background-color: #262833;
}
.timestamp span {
  display: block;
  width: 60px;
  text-align: right;
}
</style>
